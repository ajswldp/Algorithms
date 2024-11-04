class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String s:dic){
            for(String ss:spell){
                //System.out.println(s);
                String s1 = s.replaceAll(ss, "");
                if(s1.equals(s)){
                    s = "0";
                    break;
                }
                s = s1;
            }
            if(s.isEmpty()){
                return 1;
            }
        }
        return 2;
    }
}
