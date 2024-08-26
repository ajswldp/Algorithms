class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] num = my_string.toCharArray();
        for(char i:num){
            answer+=(i>90)?(char)(i-32):(char)(i+32);
        }
        return answer;
    }
}