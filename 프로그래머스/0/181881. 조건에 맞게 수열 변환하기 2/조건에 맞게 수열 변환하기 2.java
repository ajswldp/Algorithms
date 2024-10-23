class Solution {
    public int solution(int[] arr) {
        int cont = 0;
        while(true){
            boolean f = true;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]%2==0&&arr[i]>50){
                    arr[i]/=2;
                    f = false;
                }
                else if(arr[i]%2==1&&arr[i]<50){
                    arr[i] = 1+(arr[i]<<1);
                    f = false;
                }
            }
            if(f)return cont;
            cont++;
        }
    }
}