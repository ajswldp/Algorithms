import java.util.*;
class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList list = new ArrayList();
        for(int i = 0;i<progresses.length;i++){
            progresses[i] = (100-progresses[i]+speeds[i]-1)/speeds[i];
        }
        int num1 = progresses[0];
        int sum = 0;
        for(int num:progresses){
            if(num1<num){
                num1 = num;
                list.add(sum);
                sum = 1;
                
            }
            else{
                sum++;
            }
        }
        list.add(sum);
        return list;
    }
}