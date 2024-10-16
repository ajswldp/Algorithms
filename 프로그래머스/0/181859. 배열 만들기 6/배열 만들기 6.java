import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i: arr){
            if(!stack.isEmpty()&&stack.peek()==i){
                stack.pop();
            }
            else stack.push(i);
        }
        
        if(stack.isEmpty()){
            stack.push(-1);
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}