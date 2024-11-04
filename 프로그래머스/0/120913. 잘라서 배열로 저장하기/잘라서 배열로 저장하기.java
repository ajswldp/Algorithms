class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n];
        for(int i = 0;;i++){
            if(my_str.length()<=n){
                answer[i] = my_str;
                break;
            }
            answer[i] = my_str.substring(0,n);
            my_str = my_str.substring(n);
        }
        return answer;
    }
}