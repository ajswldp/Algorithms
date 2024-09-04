import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int move:moves){
            int num = 0;
            for(int i = 0;i<board.length;i++){
                if(board[i][move-1]!=0){
                    num = board[i][move-1];
                    board[i][move-1] = 0;
                    break;
                }
            }
            if(!stack.isEmpty()&&stack.peek()==num){
                stack.pop();
                sum++;
            }
            else if(num==0);
            else{
                stack.push(num);
            }
            //System.out.println(stack.toString());
        }
        return sum<<1;
    }
}