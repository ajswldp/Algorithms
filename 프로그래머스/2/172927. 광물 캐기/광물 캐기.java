
import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        Integer[] arr = new Integer[(minerals.length+4)/5>(picks[0]+picks[1]+picks[2])?(picks[0]+picks[1]+picks[2]):(minerals.length+4)/5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = new Integer(0);
        }
        for(int i = 0;i<minerals.length&&i<arr.length*5;i++){
            arr[i/5] += minerals[i].equals("diamond")?100:minerals[i].equals("iron")?10:1;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i:arr){
            if(picks[0]!=0){
                picks[0]--;
                answer += i/100+i%100/10+i%10;
            }
            else if(picks[1]!=0){
                picks[1]--;
                answer += i/100*5+i%100/10+i%10;
            }
            else {
                picks[2]--;
                answer += i/100*25+i%100/10*5+i%10;
            }
        }
        return answer;
    }
}