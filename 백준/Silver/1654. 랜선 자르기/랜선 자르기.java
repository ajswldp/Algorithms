import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MIN_VALUE>>>1;
        int interval = Integer.MIN_VALUE>>>1;
        do{
            interval/=2;
            int sum = arrayDiv(arr,ans);
            if(sum<m){
                ans-=interval;
            }
            else{
                if(arrayDiv(arr, ans+1)<m){
                    System.out.println(ans);
                    return;
                }
                ans+=interval;
            }
        }while(interval!=0);
        throw new RuntimeException();
    }
    public static int arrayDiv(int[] arr, int m){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]/m;
        }
        return sum;
    }
}