class Solution {
    int solution(int[][] land) {
        int[][]  arr = new int[land.length][4];
        arr[0][0] = land[0][0];
        arr[0][1] = land[0][1];
        arr[0][2] = land[0][2];
        arr[0][3] = land[0][3];
        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    if(j==k) continue;
                    if(arr[i-1][j] + land[i][k] > arr[i][k])arr[i][k] = arr[i-1][j] + land[i][k];
                }
            }
        }
        int max = 0;
        for(int i = 0; i < 4; i++) {
            if(arr[arr.length - 1][i] > max)max = arr[arr.length - 1][i];
        }
        return max;
    }
}