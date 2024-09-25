import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0) {
            int n = sc.nextInt();
            long sum = 0;
            while (n > 0) {
                n /= 5;
                sum += n;
            }
            System.out.println(sum);
        }
    }
}