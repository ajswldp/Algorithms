
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for(int i = 1; i < arr.length; i++){
            int max = 0;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]&&dp[j]>max){
                    max = dp[j];
                }
            }
            dp[i] = max+1;
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}