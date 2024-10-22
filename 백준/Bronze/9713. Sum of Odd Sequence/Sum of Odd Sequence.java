import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int n = sc.nextInt();
            System.out.println((n+1)*(n+1)/4);
        }
    }
}