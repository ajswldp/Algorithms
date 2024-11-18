import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] cloth : clothes) {
            if(map.containsKey(cloth[1])) {
                map.replace(cloth[1], map.get(cloth[1]) + 1);
            }
            else{
                map.put(cloth[1], 2);
            }
        }
        AtomicInteger num = new AtomicInteger(1);
        map.forEach((a, b)-> num.updateAndGet(v -> v * b));
        return num.get()-1;
    }
}