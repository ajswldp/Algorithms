import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double avg = (double) sum / n;
            int cont = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    cont++;
                }
            }
            System.out.printf("%.3f", 100.0*cont/n);
            System.out.println("%");
        }
    }
}