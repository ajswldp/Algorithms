import java.util.*;
class Main {
    static long[] arr = new long[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            System.out.println(f(sc.nextInt()));
        }
    }
    public static long f(int n) {
        if(arr[n]!=0)return arr[n];
        if(n<1)return 1;
        if(n<=2)return n;
        return arr[n] = f(n-1)+f(n-2)+f(n-3);
    }
}