import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[m][n];
        for(int[] xy: puddles){
            arr[xy[0] - 1][xy[1] - 1] = -1;
        }
        arr[0][0] = 1;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(arr[i][j] == -1) continue;
                if(i!=0 && arr[i - 1][j] != -1) arr[i][j] += arr[i - 1][j];
                if(j!=0 && arr[i][j - 1] != -1) arr[i][j] += arr[i][j - 1];
                arr[i][j] %= 1000000007;
            }
        }
        return arr[m - 1][n - 1];
    }
}