class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String a = "";
        for(int i = 0;i<s.length();i++){
            if(a.contains(s.substring(i,i+1))){
                answer[i] = i-a.lastIndexOf(s.substring(i,i+1));
            }else{
                answer[i] = -1;
            }
            a+=s.substring(i,i+1);
        }
        return answer;
    }
}