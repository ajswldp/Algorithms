import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
        int N = Integer.parseInt(S[0]);
        int n = Integer.parseInt(S[1]);
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int[] arr = new int[N];
        int idx = 0;
        while(!queue.isEmpty()) {
            for(int i = 1;i<n;i++){
                queue.add(queue.poll());
            }
            arr[idx++] = queue.poll();
        }
        System.out.print("<");
        for(int i = 0;i<N;i++){
            System.out.print(arr[i]);
            if(!(i+1==N)) System.out.print(", ");
        }
        System.out.print(">");
    }
}