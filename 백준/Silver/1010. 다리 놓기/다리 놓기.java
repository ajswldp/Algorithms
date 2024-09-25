import java.util.*;
public class Main {
    static long[][] arr = new long[30][30];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            System.out.println(f(sc.nextInt(), sc.nextInt()));
        }
    }
    public static long f(int a, int b){
        if(arr[a][b]!=0)return arr[a][b];
        if(a==b)return arr[a][b] = 1;
        if(a==1)return arr[a][b] = b;
        return arr[a][b] = f(a-1, b-1) + f(a, b-1);
    }
}