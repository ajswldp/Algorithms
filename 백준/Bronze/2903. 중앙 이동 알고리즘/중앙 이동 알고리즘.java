import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 2;
        while (N-- > 0) {
            n = (n<<1)-1;
        }
        System.out.println(n*n);
    }
}