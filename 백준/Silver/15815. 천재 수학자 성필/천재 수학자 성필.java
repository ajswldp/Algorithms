import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String input = sc.nextLine();
        for(char c : input.toCharArray()) {
            if(c=='+')stack.push(stack.pop()+stack.pop());
            else if(c=='-'){
                int a = stack.pop();
                stack.push(stack.pop()-a);
            }
            else if(c=='*')stack.push(stack.pop()*stack.pop());
            else if(c=='/'){
                int a = stack.pop();
                stack.push(stack.pop()/a);
            }
            else stack.push(c-'0');
        }
        System.out.print(stack.pop());
    }
}