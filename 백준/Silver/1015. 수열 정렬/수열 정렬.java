import java.util.*;
public class Main {
    static long[][] arr = new long[30][30];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            int min = 0;
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] < arr1[min]){
                    min = j;
                }
            }
            arr[min] = i;
            arr1[min] = 1001;
        }
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
    }
}