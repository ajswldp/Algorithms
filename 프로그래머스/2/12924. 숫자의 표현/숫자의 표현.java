class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1;i*i/2<n;i++){
            if(i%2==0){
                if(n%i==i/2)answer++;
            }
            else{
                if(n%i==0)answer++;
            }
        }
        return answer;
    }
}