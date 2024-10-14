import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a = 1;
        long b = 0;
        while(N-->0){
            long temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}