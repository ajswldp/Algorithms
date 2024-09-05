
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        char[] cArr = sc.nextLine().toCharArray();
        for (char c : cArr){
            switch (c){
                case ')':
                    while (!(stack.peek()=='(')){
                        System.out.print(stack.pop());
                    }
                    stack.pop();
                    break;
                case '-':
                case '+':
                    while (!stack.isEmpty()&&(stack.peek()=='/'||stack.peek()=='*')){
                        System.out.print(stack.pop());
                    }
                    while (!stack.isEmpty()&&(stack.peek()=='-'||stack.peek()=='+')){
                        System.out.print(stack.pop());
                    }
                case '/':
                case '*':
                    while (!stack.isEmpty()&&(stack.peek()=='/'||stack.peek()=='*')){
                        System.out.print(stack.pop());
                    }
                case '(':
                    stack.push(c);
                    break;
                default:
                    System.out.print(c);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}