import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().split(" ")[1]);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i==j)continue;
                for(int k = 0; k < arr.length; k++) {
                    if(i==k||j==k)continue;
                    int num = arr[i]+arr[j]+arr[k];
                    if(num>max&&num<=n){
                        max = num;
                    }
                }
            }
        }
        System.out.println(max);
    }
}