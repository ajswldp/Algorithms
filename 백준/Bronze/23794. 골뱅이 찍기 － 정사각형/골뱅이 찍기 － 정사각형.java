import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stream.iterate("@",a->a).limit(n+2).forEach(System.out::print);
        System.out.println();
        StringBuilder s = new StringBuilder().append("@");
        Stream.iterate("@",a->a).limit(n).forEach(a->s.append(" "));
        s.append("@");
        Stream.iterate("@",a->a).limit(n).forEach(a->System.out.println(s));
        Stream.iterate("@",a->a).limit(n+2).forEach(System.out::print);
    }
}
