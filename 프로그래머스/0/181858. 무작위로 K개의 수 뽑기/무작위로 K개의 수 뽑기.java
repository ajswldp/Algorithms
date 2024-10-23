import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new LinkedList<>();
        for(int i:arr){
            if(!list.contains(i)){
                list.add(i);
            }
            if(list.size() == k){return list.stream().mapToInt(a->a).toArray();}
        }
        while(list.size() < k){
            list.add(-1);
        }
        return list.stream().mapToInt(a->a).toArray();
    }
}