
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100];
        while(N-->0){
            int n = sc.nextInt();
            int idx = 2;
            arr[1] = arr[2] = 1;
            while(arr[idx]<=n){
                arr[++idx] = arr[idx-1] + arr[idx-2];
            }
            Stack<Integer> stack = new Stack<>();
            n-=arr[--idx];
            stack.push(arr[idx]);
            while(n!=0){
                if(n>=arr[--idx]){
                    stack.push(arr[idx]);
                    n-=arr[idx];
                }
            }

            while(!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }
    }
}