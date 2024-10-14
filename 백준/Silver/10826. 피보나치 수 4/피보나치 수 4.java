import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        while(N-->0){
            b = a.add(b);
            a = b.subtract(a);
        }
        System.out.println(b);
    }
}