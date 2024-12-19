import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
        int N = Integer.parseInt(S[0]);
        int n = Integer.parseInt(S[1]);
        MyQueue<Integer> queue = new MyQueue<>();
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int[] arr = new int[N];
        int idx = 0;
        while(!queue.isEmpty()) {
            queue.shift(n);
            arr[idx++] = queue.poll();
        }
        System.out.print("<");
        System.out.print(Arrays.toString(arr).replaceAll("[\\[\\]]", ""));
        System.out.print(">");
    }
    public static class MyQueue<E> extends LinkedList<E>{
        public void shift(int n){
            for(int i = 1; i<n; i++){
                super.add(this.poll());
            }
        }
    }
}