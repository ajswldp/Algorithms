import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        MyStack stack = new MyStack();
        for(int num : ingredient) {
            answer += stack.push(num);
        }
        return answer;
    }
    class MyStack extends Stack<Integer>{

        public Integer push(Integer item) {
            addElement(item);
            int len = size();
            if(len>3&&elementAt(len-1) == 1 && elementAt(len-2) == 3 && elementAt(len-3) == 2 && elementAt(len-4) == 1){
                pop();
                pop();
                pop();
                pop();
                return 1;
            }
            return 0;
        }
    }
}