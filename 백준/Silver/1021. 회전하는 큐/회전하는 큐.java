import java.util.*;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numArr = Stream.iterate(1, a->a+1).limit(n).mapToInt(a->a).toArray();
        Queue<Integer> stack = new LinkedList<>();
        for(int num: numArr){
            stack.offer(num);
        }
        int sum = 0;
        for(int num: arr){
            int cont = 0;
            while(stack.peek()!=num){
                stack.offer(stack.poll());
                cont++;
            }
            sum+=Math.min(cont, stack.size()-cont);
            stack.poll();
        }
        System.out.println(sum);
    }
}