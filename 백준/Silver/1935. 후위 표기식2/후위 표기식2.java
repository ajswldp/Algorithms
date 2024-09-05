import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] cArr = sc.nextLine().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put((char)(65+i), sc.nextInt());
        }
        Stack<Double> stack = new Stack<>();
        for(char c : cArr){
            double num;
            if(c=='+')
                stack.push(stack.pop()+stack.pop());
            else if(c=='-') {
                num = stack.pop();
                stack.push(stack.pop() - num);
            }
            else if(c=='*')
                stack.push(stack.pop()*stack.pop());
            else if(c=='/') {
                num = stack.pop();
                stack.push(stack.pop() / num);
            }
            else{
                stack.push((double)map.get(c));
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}