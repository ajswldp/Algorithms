import java.util.*;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(Math.min(Math.min(f(0, n-1, arr), f(1, n-1, arr)), f(2, n-1, arr)));
    }
    static int[][] dp = new int[1010][3];
    public static int f(int flag, int n, int[][] arr){
        if(dp[n][flag]!=0)return dp[n][flag];
        if(n==0)return dp[n][flag] = arr[n][flag];
        return dp[n][flag] = arr[n][flag] + Math.min(f((flag+1)%3, n-1, arr), f((flag+2)%3, n-1, arr));
    }
}