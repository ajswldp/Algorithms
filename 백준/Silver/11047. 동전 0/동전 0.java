import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[n];
        for (int i = n-1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }
        int cont = 0;
        for(int i = 0;i<n;i++) {
            cont+=num/arr[i];
            num -= num/arr[i]*arr[i];
        }
        System.out.println(cont);
    }
}