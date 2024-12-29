
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        while(N-->0){
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            for(char c: sc.nextLine().toCharArray()){
                if(c=='(')stack.push(1);
                else {
                    stack.pop();
                    if(stack.isEmpty()){
                        break;
                    }
                }
            }
            System.out.println(stack.size()==1?"YES":"NO");
        }
    }
}