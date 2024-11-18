import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] elements) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            int num = 0;
            for(int j = i; j < elements.length+i; j++) {
                num += elements[j%elements.length];
                if(!map.containsKey(num)) {
                    map.put(num, 1);
                }
            }
        }
        return map.size();
    }
}