class Solution {
    public int solution(int a, int b) {
        a*=1000*256;
        return a%b==0?1:2;
    }
}