import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cont = 0;
        for(int i :d){
            if(budget-i<0)break;
            budget-=i;
            cont++;
        }
        return cont;
    }
}