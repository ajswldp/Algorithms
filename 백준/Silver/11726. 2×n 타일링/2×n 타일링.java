
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        while(N-- > 0) {
            int temp = (a+b)%10007;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}
