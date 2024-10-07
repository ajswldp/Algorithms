import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cont = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] <= arr[i+1]) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}