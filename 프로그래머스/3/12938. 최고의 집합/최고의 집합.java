class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(n>s){
            int[] a = {-1};
            return a;
        }
        for(int i = 0;i<n;i++){
            answer[i] = s/(n-i);
            s-= answer[i];
        }
        return answer;
    }
}