import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cont = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while(true){
            int maxIndex = 0;
            for(int i = 1; i < n; i++){
                if(arr[i] >= arr[maxIndex]){
                    maxIndex = i;
                }
            }
            if(maxIndex == 0){
                break;
            }
            cont++;
            arr[0]++;
            arr[maxIndex]--;
        }
        System.out.println(cont);
    }
}