import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] answer = new int[emergency.length];
        for(int i = 0;i<emergency.length;i++){
            map.put(emergency[i], i);
        }
        Arrays.sort(emergency);
        for(int i = emergency.length;i>0;i--){
            answer[map.get(emergency[emergency.length-i])] = i;
        }
        return answer;
    }
}