import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int num: works) {
            queue.add(-num);
        }
        while(n-->0){
            if(queue.isEmpty())return 0;
            int num = queue.poll()+1;
            if(num!=0)queue.add(num);
        }
        while(!queue.isEmpty()){
            int num = queue.poll();
            answer += (long)num*num;
        }
        return answer;
    }
}