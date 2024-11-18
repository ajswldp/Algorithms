import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] arr : edge) {
            graph.get(arr[0]-1).add(arr[1]-1);
            graph.get(arr[1]-1).add(arr[0]-1);
        }
        AtomicReference<Queue<Integer>> queue = new AtomicReference<>(new LinkedList<>());
        queue.get().add(0);
        int[] arr = new int[n];
        while(true) {
            arr[0] = 1;
            Queue<Integer> temp = new LinkedList<>();
            queue.get().forEach(a->{
                graph.get(a).forEach(e -> {
                    if(arr[e] == 1)return;
                    arr[e] = 1;
                    temp.add(e);
                });
            });
            if(temp.isEmpty()) return queue.get().size();
            queue.set(temp);
        }
    }
}