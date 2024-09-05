import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        for(int i = 0; i < arr.length*2; i++){
            for(int j = 0; j < arr[i%arr.length].length; j++){
                arr[i%arr.length][j] += sc.nextInt();
                if(i>=arr.length){
                    System.out.print(arr[i%arr.length][j]+" ");
                }
            }
            if(i>=arr.length){
                System.out.println();
            }
        }
    }
}