import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = -100;
        for(int i = 0; i < 9; i++) {
            sum += arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int j = 8;
        while(arr[i]+arr[j]!=sum){
            if(arr[i]+arr[j]<sum){i++;}
            else{j--;}
        }
        for(int k = 0; k < 9; k++) {
            if(k!=i&&k!=j){
                System.out.println(arr[k]);
            }
        }
    }
}
