class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String str = board[h][w];
        if(h>0&&str.equals(board[h-1][w]))answer++;
        if(h<board.length&&str.equals(board[h+1][w]))answer++;
        if(w>0&&str.equals(board[h][w-1]))answer++;
        if(w<board[0].length&&str.equals(board[h][w+1]))answer++;
        return answer;
    }
}