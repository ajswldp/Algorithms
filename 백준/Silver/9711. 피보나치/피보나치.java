
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long a = 1;
            long b = 0;
            while (n-- > 0) {
                long temp = (a+b)%q;
                a = b;
                b = temp;
            }
            System.out.println("Case #" + i + ": " + b);
        }
    }
}
