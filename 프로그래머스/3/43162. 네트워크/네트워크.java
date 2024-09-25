
import java.util.*;
import java.util.stream.Stream;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        List<List<Integer>> list = new ArrayList();
        for(int[] i:computers){
            list.add(new ArrayList());
        }
        for(int i = 0;i<computers.length;i++){
            for(int j = 0;j<computers.length;j++){
                if(i!=j&&computers[i][j]==1)
                    list.get(i).add(j);
            }
        }
        List<Integer> com = new ArrayList();
        for(int i = 0;i<computers.length;i++){
            com.add(i);
        }
        while(!com.isEmpty()){
            int node = com.remove(0);
            Queue<Integer> queue = new LinkedList<>();
            queue.add(node);
            answer++;
            while(!queue.isEmpty()){
                int num = queue.peek();
                for(int a:list.get(num)){
                    list.get(a).remove(queue.peek());
                    queue.add(a);
                }
                com.remove(queue.poll());
            }
        }

        return answer;
    }
}