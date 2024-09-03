class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0;i<=myString.length()-pat.length();i++){
            if(f(myString, pat, i))answer++;
        }
        return answer;
    }
    public boolean f(String myString, String pat, int idx){
        for(int i = 0;i<pat.length();i++){
            if(myString.charAt(i+idx)!=pat.charAt(i))return false;
        }
        return true;
    }
}