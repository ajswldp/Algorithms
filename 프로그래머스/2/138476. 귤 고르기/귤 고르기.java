import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : tangerine) {
            if(map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
            }
            else{
                map.put(n, 1);
            }
        }
        Queue<Integer>queue = new PriorityQueue<>(Comparator.reverseOrder());
        map.forEach((a, b)->queue.add(b));
        int cont = 0;
        while(k>0){
            k-=queue.poll();
            cont++;
        }
        return cont;
    }
}