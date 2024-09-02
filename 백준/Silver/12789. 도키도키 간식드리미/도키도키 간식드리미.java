
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        while(N-->0){
            queue.add(sc.nextInt());
        }
        int num = 1;
        Stack<Integer> stack = new Stack<>();
        while(!(queue.isEmpty()&&stack.isEmpty())){
            if((!stack.isEmpty())&&stack.peek() == num){
                stack.pop();
                num++;
            }
            else if((!queue.isEmpty())&&queue.peek() == num){
                queue.remove();
                num++;
            }
            else if(queue.isEmpty()){
                System.out.println("Sad");
                return;
            }
            else {
                stack.add(queue.remove());
            }
        }
        System.out.println("Nice");
    }
}