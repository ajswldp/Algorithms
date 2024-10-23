class Solution {
    public int solution(int n) {
        int num = 0;
        while(n>0){
            if(f(++num))n--;
        }
        return num;
    }
    public boolean f(int n){
        if(n%3==0||n%10==3||n/10%10==3)return false;
        return true;
    }
}