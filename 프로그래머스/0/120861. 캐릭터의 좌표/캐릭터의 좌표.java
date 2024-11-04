class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        for(String s:keyinput){
            if(s.equals("left")){
                x--;
                if(-board[0]/2>x)x++;
            }
            else if(s.equals("right")){
                x++;
                if(board[0]/2<x)x--;
            }
            else if(s.equals("up")){
                y++;
                if(board[1]/2<y)y--;
            }
            else {
                y--;
                if(-board[1]/2>y)y++;
            }
        }
        return new int[]{x, y};
    }
}