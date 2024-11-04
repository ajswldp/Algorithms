
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new LinkedList();
        for(int i = 2;n!=1;i++){
            if(n%i==0){
                list.add(i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}