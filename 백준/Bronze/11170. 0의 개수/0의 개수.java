
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sum = new StringBuilder("1");
            for(int i = a;i<=b;i++){
                sum.append(i).append("1");
            }
            String[] arr = sum.toString().split("0");
            System.out.println(arr.length-1);
        }
    }
}
