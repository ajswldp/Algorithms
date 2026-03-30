
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream stream = Stream.iterate(1, i -> i + 1).limit(n).mapToInt(i -> i);
        int m = (n+1)*n/2;
        System.out.println(m);
        System.out.println(m*m);
        System.out.println(stream.map(a->a*a*a).sum());
    }
}
