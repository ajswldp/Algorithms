import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i<=36; i++) {
            map.put(i, i>=10?(char)(i+55):(char)(i+'0'));
        }
        String s = "";
        while(arr[0]>0){
            s = map.get(arr[0]%arr[1])+s;
            arr[0] /= arr[1];
        }
        System.out.println(s);
    }
}