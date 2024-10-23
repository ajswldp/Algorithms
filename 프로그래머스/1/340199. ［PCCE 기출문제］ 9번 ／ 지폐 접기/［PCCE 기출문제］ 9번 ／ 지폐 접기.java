class Solution {
    public int solution(int[] wallet, int[] bill) {
        wallet = tamp(wallet);
        bill = tamp(bill);
        int answer = 0;
        while(wallet[0]<bill[0]||wallet[1]<bill[1]){
            bill = f(bill);
            answer++;
        }
        return answer;
    }
    public int[] f(int[] arr){
        arr = tamp(arr);
        arr[0]/=2;
        return tamp(arr);
    }
    public int[] tamp(int[] arr){
        if(arr[0]<arr[1]){
            int tamp = arr[0];
            arr[0] = arr[1];
            arr[1] = tamp;
        }
        return arr;
    }
}