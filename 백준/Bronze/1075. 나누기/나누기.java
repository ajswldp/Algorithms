
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt()/100*100;
        long b = sc.nextInt();
        long c = ((a-1)/b*b+b)%100;
        System.out.printf("%02d", c);
    }
}