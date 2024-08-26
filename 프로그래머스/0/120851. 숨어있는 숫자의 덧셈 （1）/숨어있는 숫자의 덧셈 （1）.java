class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] a = my_string.toCharArray();
        for(char b : a){
            if ((int)b-48<10){
                answer+=b-48;
            }
        }
        return answer;
    }
}