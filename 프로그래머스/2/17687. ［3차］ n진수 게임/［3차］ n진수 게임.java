class Solution {
    public String solution(int n, int t, int m, int p) {
        String s = "";
        for(int i = 0; s.length() < t*m; i++){
            s += Integer.toString(i, n);
        }
        s = s.toUpperCase();
        String a = "";
        for(int i = p-1; i < t*m; i+=m){
            a += s.charAt(i);
        }
        return a;
    }
}