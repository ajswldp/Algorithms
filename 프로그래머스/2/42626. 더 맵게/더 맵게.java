/**
 * 1. 우선순위큐 생성(기본적으로 최소힙)
 * 2. scoville의 요소를 다 우선순위큐에 넣기
 * 3. 큐의 꼭대기(최소힙이니 최소값)가 K보다 작으면
 *    if 큐의 크기가 1일때 -1리턴
 *    1. 큐에서 제일 작은놈 2개 뺌
 *    2. 큐에 (제일 작은거 + 두번째로 작은거 * 2)를 추가
 *    3. 카운트
 * 4. 카운트를 리턴
 */
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int num: scoville) {
            queue.add(num);
        }
        int cont = 0;
        while(queue.peek()<K){
            if(queue.size()==1)return -1;
            queue.add(queue.poll()+ queue.poll()*2);
            cont++;
        }
        return cont;
    }
}