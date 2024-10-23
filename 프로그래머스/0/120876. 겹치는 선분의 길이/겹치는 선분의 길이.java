import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[300];
        for(int[] line:lines){
            for(int i = line[0]+100;i<line[1]+100;i++){
                arr[i]++;
            }
        }
        return (int)Arrays.stream(arr).filter(a->a>1).count();
    }
}