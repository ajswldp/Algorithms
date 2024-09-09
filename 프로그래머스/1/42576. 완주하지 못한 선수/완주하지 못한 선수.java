import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: completion) {
            if(map.containsKey(s)) {
                map.replace(s, map.get(s)+1);
            }
            else{
                map.put(s, 0);
            }
        }
        for(String s: participant) {
            if(!map.containsKey(s)) {
                return s;
            }else if(map.get(s)==0){
                map.remove(s);
            }else{
                map.replace(s, map.get(s) - 1);
            }
        }
        return "";
    }
}