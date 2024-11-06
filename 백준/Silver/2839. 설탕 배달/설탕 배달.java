import java.util.*;
class Main {
    static long[] arr = new long[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n%5!=0){
            n-=3;
            sum++;
        }
        if(n<0){
            System.out.println(-1);
            return;
        }
        System.out.println(sum+n/5);
    }
}