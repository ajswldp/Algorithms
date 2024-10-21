import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] num = Stream.iterate(1, a->a).limit(5).mapToInt(a -> a).toArray();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                num[i]*=arr[i];
            }
        }
        System.out.println(Arrays.stream(num).sum());
    }
}