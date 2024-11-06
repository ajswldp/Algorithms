import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        arr[1][0] = 1;
        for(int i = 1;i<=n+1;i++){
            for(int j = 1;j<=n+1;j++){
                arr[i][j] = (arr[i-1][j]+arr[i][j-1])%1000000007;
            }
        }
        System.out.println(arr[n+1][n+1]+" "+(n*n));
    }
}