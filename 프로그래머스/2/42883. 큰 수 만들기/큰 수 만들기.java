import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        for (; k!=0; i++) {
            if(i==number.length()){
                stack.pop();
                i--;
                k--;
            }
            else if(stack.isEmpty()||stack.peek() >= number.charAt(i)){
                stack.push(number.charAt(i));
            }
            else{
                stack.pop();
                i--;
                k--;
            }
        }
        String answer = number.substring(i);
        while(!stack.isEmpty()){
            answer = stack.pop()+answer;
        }
        return answer;
    }
}