import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("0\n0");
            return;
        }
        System.out.println((n<0&&n%2==0)?-1:1);
        if(n<0)n*=-1;
        long a = 1;
        long b = 0;
        while(n-->0){
            long temp = (a+b)%1000000000;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}