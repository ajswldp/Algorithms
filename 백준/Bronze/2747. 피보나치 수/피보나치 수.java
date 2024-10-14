import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int b = 0;
        while(N-->0){
            int temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}