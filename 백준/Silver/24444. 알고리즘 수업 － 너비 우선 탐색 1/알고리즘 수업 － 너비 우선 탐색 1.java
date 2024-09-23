import java.util.*;
public class Main {
    static int[] arr;
    static int cont = 1;
    static Queue<Integer> q;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        int s = sc.nextInt()-1;
        arr = new int[n];
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
        arr[s] = cont++;
        q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()) {
            f(board);
        }
        System.out.println(Arrays.toString(arr)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", " "));
    }
    public static void f(List<List<Integer>> board){
        int n = q.poll();
        for(int i:board.get(n)){
            if(arr[i]==0){
                q.add(i);
                arr[i] = cont++;
            }
        }
    }
}