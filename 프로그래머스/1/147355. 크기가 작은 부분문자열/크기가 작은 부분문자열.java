class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);
        for(int i = 0;i+p.length()<=t.length();i++){
            //System.out.println(t.substring(i, i+p.length())+" "+num);
            if(Long.parseLong(t.substring(i, i+p.length()))<=num){
                answer++;
            }
            //System.out.println(answer+"\n");
        }
        return answer;
    }
}