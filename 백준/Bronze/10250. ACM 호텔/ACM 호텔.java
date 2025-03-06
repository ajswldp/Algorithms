import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            sc.nextInt();
            int k = sc.nextInt();
            System.out.println(((k-1)%m+1)*100+(k-1)/m+1);
        }
    }
}