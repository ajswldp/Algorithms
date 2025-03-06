import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()*sc.nextInt()*sc.nextInt();
        int[] arr = new int[10];
        while(n!=0){
            arr[n%10]++;
            n/=10;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}