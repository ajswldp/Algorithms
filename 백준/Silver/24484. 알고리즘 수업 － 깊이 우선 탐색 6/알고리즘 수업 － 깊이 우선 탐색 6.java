
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;
public class Main {
    static long[] arr;
    static int cont = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        int s = sc.nextInt();
        arr = Stream.iterate(-1, a->a).limit(n).mapToLong(a->a).toArray();
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
            Collections.sort(board.get(i), Collections.reverseOrder());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(s-1);
        arr[s-1] = 0;
        f(stack, board);
        BigInteger bigInteger = new BigInteger(String.valueOf(0));
        for(long a:arr){
            if(a!=-1)bigInteger =  bigInteger.add(new BigInteger(String.valueOf(a)));
        }
        System.out.println(bigInteger);
    }
    public static void f(Stack<Integer> stack, List<List<Integer>> board) {
        if(!board.get(stack.peek()).isEmpty()) {
            for (int i : board.get(stack.peek())) {
                if (-1 == arr[i]) {
                    arr[i] = (long)stack.size()* ++cont;
                    stack.push(i);
                    f(stack, board);
                }
            }
        }
        stack.pop();
    }
}