import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        int[] arr = new int[n];
        int[] idxArr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            idxArr[arr[i]-1] = i;
        }

        for(int i = 0; i < n; i++){
            if(idxArr[i] == i) {
                System.out.print(count[i]+" ");
                continue;
            }
            count[i] += idxArr[i]-i;
            count[arr[i]-1] += idxArr[i]-i;
            idxArr[arr[i]-1] = idxArr[i];
            arr[idxArr[i]] = arr[i];
            idxArr[i] = i;//fdsfsdf
            arr[i] = i+1;//fdsfsdf
            System.out.print(count[i]+" ");
        }
    }
}