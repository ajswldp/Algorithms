import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            int n = sc.nextInt();
            System.out.println(f(n));
        }
    }
    static long[] arr = new long[101];
    public static long f(int n){
        if(arr[n]!=0) return arr[n];
        if(n<=3)return arr[n] = 1;
        if(n<=5)return arr[n] = 2;
        return arr[n] = f(n-1) + f(n-5);
    }
}