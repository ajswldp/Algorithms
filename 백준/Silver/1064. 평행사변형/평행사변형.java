import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Integer::parseInt).toArray();
        if(arr[0]==arr[2]&&arr[0]==arr[4]||(arr[1]-arr[3])/(arr[0]-arr[2])*(arr[4]-arr[0])==(arr[5]-arr[1])){
            System.out.println("-1.0");
            return;
        }
        double ab = Math.sqrt((arr[0]-arr[2])*(arr[0]-arr[2])+(arr[1]-arr[3])*(arr[1]-arr[3]));
        double ac = Math.sqrt((arr[0]-arr[4])*(arr[0]-arr[4])+(arr[1]-arr[5])*(arr[1]-arr[5]));
        double bc = Math.sqrt((arr[4]-arr[2])*(arr[4]-arr[2])+(arr[5]-arr[3])*(arr[5]-arr[3]));
        System.out.println((Math.max(Math.max(ab, ac), bc)-Math.min(Math.min(ab, ac), bc))*2);
    }
}