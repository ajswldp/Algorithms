
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(f(n, a, b, 0));

    }
    public static long f(int n, int a, int b, long num){
        if(n==0)return num/4;
        int n2 = 1<<n-1;
        if(n2>a){
            if(n2>b){
                return f(n-1, a, b, num*4);
            }
            else{
                return f(n-1, a, b%n2, (num+1)*4);
            }
        }
        else{
            if(n2>b){
                return f(n-1, a%n2, b, (num+2)*4);
            }
            else{
                return f(n-1, a%n2, b%n2, (num+3)*4);
            }
        }
    }
}