import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int num = 0;
        int sum = 0;
        for(int i:arr){
            num+=i;
            sum+=num;
        }
        System.out.println(sum);
    }
}