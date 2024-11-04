class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        if(A.length()==1)return -1;
        String s = A;
        int cont = 0;
        do{
            s = s.charAt(s.length()-1)+s.substring(0, s.length()-1);
            ++cont;
            if(s.equals(B)) return cont;
        }while (!A.equals(s));
        return -1;
    }
}