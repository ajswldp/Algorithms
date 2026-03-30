
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(a->Integer.parseInt(a)).toArray();
        System.out.println(Arrays.stream(arr)
                .min()
                .getAsInt()
                *
                Arrays.stream(arr)
                        .max()
                        .getAsInt());
    }
}