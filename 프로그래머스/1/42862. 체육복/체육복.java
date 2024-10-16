import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n];
        Arrays.stream(reserve).forEach(e -> arr[e-1]++);
        Arrays.stream(lost).forEach(e -> arr[e-1]--);
        for(int i = 0; i < n; i++) {
            if(arr[i] == -1) {
                if(i!=0&&arr[i-1]==1) {
                    arr[i]++;
                    arr[i-1]--;
                }
                else if(i!=n-1&&arr[i+1]==1) {
                    arr[i]++;
                    arr[i+1]--;
                }
            }
        }
        return (int)Arrays.stream(arr).filter(a->a>=0).count();
    }
}