import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int s = 1;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(s==num){
                sb.append("+\n-\n");
                s++;
            }
            else if(!stack.isEmpty()&&stack.peek()==num){
                stack.pop();
                sb.append("-\n");
            }
            else if(s>num){
                System.out.println("NO");
                return;
            }
            else {
                while(s<=num){
                    stack.push(s++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
}