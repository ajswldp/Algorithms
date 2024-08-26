
import java.util.Scanner;

public class Main {
    static int[] arr = new int[100000];
    static int top = -1;
    public static void push(int x) {
        arr[++top] = x;
    }
    public static int pop() {
        return top==-1?-1:arr[top--];
    }
    public static int peek(){
        return top==-1?-1:arr[top];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            switch (line.charAt(0)) {
                case 'p':
                    if(line.charAt(1)=='u'){
                        push(Integer.parseInt(line.substring(5)));
                    }
                    else{
                        System.out.println(pop());
                    }
                    break;
                case 's':
                    System.out.println(top+1);
                    break;
                case 'e':
                    System.out.println(top==-1?1:0);
                    break;
                case 't':
                    System.out.println(peek());
                    break;
            }
        }
    }
}
