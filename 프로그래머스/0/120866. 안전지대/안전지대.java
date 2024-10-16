class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(f(board, i, j))answer++;
            }
        }
        return answer;
    }
    public boolean f(int[][] board, int x, int y){
        return f1(board, x-1, y-1)&&f1(board, x-1, y)&&f1(board, x-1, y+1)&&f1(board, x, y-1)&&f1(board, x, y)&&f1(board, x, y+1)&&f1(board, x+1, y-1)&&f1(board, x+1, y)&&f1(board, x+1, y+1);
    }
    public boolean f1(int[][] board, int x, int y){
        if(x<0)return true;
        if(y<0)return true;
        if(x>=board.length)return true;
        if(y>=board[0].length)return true;
        if(board[x][y] == 0) return true;
        return false;
    }
}