import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            int[][] arr = new int[sc.nextInt()][sc.nextInt()];
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                arr[sc.nextInt()][sc.nextInt()] = 1;
            }
            int cont = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(f(arr, i, j))cont++;
                }
            }
            System.out.println(cont);
        }
    }
    public static boolean f(int[][] arr, int i, int j){
        if(i<0||j<0||i>=arr.length||j>=arr[i].length)return false;
        if(arr[i][j] == 1){
            arr[i][j] = 0;
            f(arr, i, j+1);
            f(arr, i, j-1);
            f(arr, i-1, j);
            f(arr, i+1, j);
            return true;
        }
        return false;
    }
}
