import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Math.round((float) Arrays.stream(arr).sum()/arr.length));
        System.out.println(arr[arr.length/2]);

        int[] arr2 = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]+4000]++;
        }
        int maxV = Arrays.stream(arr2).max().getAsInt();
        int maxA = -1;
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i]==maxV){
                if(maxA==-1){
                    maxA = i;
                }
                else{
                    maxA = i;
                    break;
                }
            }
        }
        System.out.println(maxA-4000);
        System.out.println(Arrays.stream(arr).max().getAsInt()-Arrays.stream(arr).min().getAsInt());
    }
}