import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 0;
        for(int i = 0;i<n;i++){
            b+=a;
            a = b-a;
        }
        System.out.println(b+" "+(n-2));
    }
}