import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        n-=m;
        m = sc.nextInt()-m;
        System.out.println((m-1)/n+1);
    }
}