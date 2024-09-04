import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Integer> stack = new Stack<>(); //int형 스택 선언
        char[] cArr = s.toCharArray();
        for(char c : cArr){
            if (c=='(')stack.push(1);
            else if(stack.isEmpty()){
                return false;
            }
            else stack.pop();
        }
        
        return stack.isEmpty();
    }
}