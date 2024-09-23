import java.util.*;
public class Main {
    static int[] arr;
    static int cont = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        int s = sc.nextInt();
        arr = new int[n];
        List<List<Integer>> board = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            board.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            board.get(a).add(b);
            board.get(b).add(a);
        }
        for(int i = 0; i < n; i++) {
            Collections.sort(board.get(i));
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(s-1);
        arr[s-1] = cont++;
        f(stack, board);
        System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(", ", "\n"));
    }
    public static void f(Stack<Integer> stack, List<List<Integer>> board) {
        if(!board.get(stack.peek()).isEmpty()) {
            for (int i : board.get(stack.peek())) {
                if (0 == arr[i]) {
                    arr[i] = cont++;
                    stack.push(i);
                    f(stack, board);
                }
            }
        }
        stack.pop();
    }
}