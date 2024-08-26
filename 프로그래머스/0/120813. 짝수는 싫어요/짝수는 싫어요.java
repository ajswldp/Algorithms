class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n%2==1)?(n+1)/2:n/2];
        for(int i = 1;n>=i;i+=2){
            answer[(i-1)/2]=i;
        }
        return answer;
    }
}