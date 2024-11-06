import java.util.*;
class Main {
    static int[] arr = new int[302];
    static int[] a = new int[302];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n==1){
            System.out.println(arr[1]);
            return;
        }
        System.out.println(Math.max(Math.max(f(n-1), f(n-2)), f(n-3)+arr[n-2])+arr[n]);
        //System.out.println(Arrays.toString(a));
    }
    public static int f(int n){
        if(n<0)return 0;
        if(n<=2)return a[n] = arr[n];
        if(a[n]!=0)return a[n];
        return a[n] = arr[n]+Math.max(f(n-2), f(n-3)+arr[n-2]);
    }
}