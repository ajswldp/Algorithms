
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int N = sc.nextInt();
        while(N-->0){
            int n = sc.nextInt();
            if(n==0) System.out.println("1 0");
            else if(n==1) System.out.println("0 1");
            else if(arr[n]!=0)System.out.println(arr[n-1]+" "+arr[n]);
            else {
                int a = 1;
                int b = 1;
                for(int i = 2;i<n;i++){
                    int num = a+b;
                    a = b;
                    b = num;
                }
                System.out.println(a+" "+b);
            }
        }
    }
}