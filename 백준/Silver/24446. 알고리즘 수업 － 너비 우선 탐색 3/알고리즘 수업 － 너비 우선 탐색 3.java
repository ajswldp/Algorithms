import java.util.*;
import java.util.stream.Stream;

public class Main {
    static int[] arr;
    static int cont = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        int s = sc.nextInt()-1;
        arr = Stream.iterate(-1, a->a).limit(n).mapToInt(a->a).toArray();
        List<List<Integer>> board = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            board.add(new ArrayList<>());
        }
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            board.get(a).add(b);
            board.get(b).add(a);
        }
        for(int i = 0; i < n; i++) {
            Collections.sort(board.get(i));
        }
        arr[s] = 0;
        Queue<Integer>q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()) {
            q = f(board, q);
            cont++;
        }
        System.out.println(Arrays.toString(arr)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", " "));
    }
    public static Queue<Integer> f(List<List<Integer>> board, Queue<Integer>q) {
        Queue<Integer> queue = new LinkedList<>();
        while(!q.isEmpty()) {
            int n = q.poll();
            for (int i : board.get(n)) {
                if (arr[i] == -1) {
                    queue.add(i);
                    arr[i] = cont;
                }
            }
        }
        return queue;
    }
}