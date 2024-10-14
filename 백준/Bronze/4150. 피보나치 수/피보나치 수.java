
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");
        while(N-- > 0) {
            b = a.add(b);
            a = b.subtract(a);
        }
        System.out.println(b);
    }
}