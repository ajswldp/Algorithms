import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int maxIndex = 1;
        for(int i = 1;i<10;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println(arr[maxIndex]);
        System.out.println(maxIndex);
    }
}