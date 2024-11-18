import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char c : chars) {
            if(stack.isEmpty() || c != stack.peek()) {
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        return stack.isEmpty()?1:0;
    }
}