import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);
        for(int mat:mats){
            for(int i = 0;i<=park.length-mat;i++){
                for(int j = 0;j<=park[0].length-mat;j++){
                    boolean f = true;
                    for(int a = 0;a<mat;a++){
                        for(int b = 0;b<mat;b++){
                            if(!park[i+a][j+b].equals("-1"))f = false;
                        }
                    }
                    if(f)answer = mat;
                }
            }
            if(answer!=mat)return answer;
        }
        return answer;
    }
}