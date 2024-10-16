class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int max = n*n/2+(n+1)/2;
        int cont = 1;
        int i = 0;
        int j = 0;
        arr[0][0] = 1;
        while(cont<max){
            while(i+1<n&&arr[i+1][j]==0){arr[++i][j] = ++cont;}
            while(j+1<n&&arr[i][j+1]==0){arr[i][++j] = ++cont;}
            while(arr[i-1][j-1]==0){arr[--i][--j] = ++cont;}
        }
        int[] arr1 = new int[cont];
        int idx = 0;
        for(int[] arr3:arr){
            for(int num:arr3){
                if(num!=0)arr1[idx++] = num;
            }
        }
        return arr1;
    }
}