
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(a->Integer.parseInt(a)).toArray();
        Integer[] arr2 = new Integer[arr.length];
        for(int i = 0;i<arr.length ;i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        long sum = 0;
        for(int i = 0;i<arr1.length;i++){
            sum+= (long) arr1[i] *arr2[i];
        }
        System.out.println(sum);
    }
}