/**
 * 1. sum 선언 및 0으로 초기화
 * 2. moves의 길이만큼 반복:
 *    1. board의 열의 갯수만큼 반복:
 *       1. 변수선언 및 특정 값으로 초기화
 *       2. board의 move열에서 0제외 가장 높이 있는 값을 스택에 push
 *       3. board에서 값을 꺼낸 곳을 0으로 초기화
 *    2. 만약 스택이 비어있지 않고, 스택의 최상단의 값이 board에서 꺼낸 값과 같다면:
 *       1. pop
 *       2. sum++
 *    3. 변수가 초기값이 아니라면(board에서 값을 꺼냈으면) 스택에 push
 *    
 *    return sum<<1;
 */
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
        }
        return sum<<1;
    }
}