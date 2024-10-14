
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int b = 0;
        while(N-->0){
            b = a+b;
            a = b-a;
        }
        System.out.println(b);
    }
}