import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void quickSort(int[] arr, int l, int r){
        if(l > r)return;
        int left = l;
        int right = r;
        int pivot = right;
        while(left < right){
            while(arr[left] < arr[pivot])left++;
            swap(arr, left, pivot);
            pivot = left;
            while(arr[right] > arr[pivot])right--;
            swap(arr, right, pivot);
            pivot = right;
        }
        quickSort(arr, l, pivot - 1);
        quickSort(arr, pivot + 1, r);
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}