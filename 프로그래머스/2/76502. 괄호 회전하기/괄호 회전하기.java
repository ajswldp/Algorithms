import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] str = (s + s).toCharArray();
        for(int i = 0;i < str.length;i++){
            if(str[i] == 91 || str[i] == 123)str[i]++;
        }
        for (int i = 0; i < s.length() ; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length() ; j++) {
                if(!stack.empty() && stack.peek()+1 == str[i + j]) stack.pop();
                else stack.push(str[i + j]);
            }
            if(stack.empty()) answer++;
        }
        return answer;
    }
}