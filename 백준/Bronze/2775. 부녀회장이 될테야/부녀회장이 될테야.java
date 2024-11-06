import java.util.*;
import java.util.stream.Stream;

class Main {
    static long[] arr = new long[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[30][30];
        arr[0] = Stream.iterate(0, a->a+1).limit(30).mapToInt(a->a).toArray();
        while(N-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            for(int i = 1;i<=a;i++){
                for(int j = 1;j<=b;j++){
                    arr[i][j] = arr[i-1][j]+arr[i][j-1];
                }
            }
            System.out.println(arr[a][b]);
        }
    }
}