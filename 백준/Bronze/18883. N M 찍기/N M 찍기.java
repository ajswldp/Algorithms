
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0;i<a;i++){
            String s = Arrays.toString(IntStream.range(i*b+1, (i+1)*b+1).toArray());
            System.out.println(s.substring(1, s.length()-1).replace(",", ""));
        }
    }
}