
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int n = Arrays.stream(numbers).sum()-target>>1;
        return f(numbers, n, 0);
    }
    public int f(int[] numbers, int n, int idx) {
        if(n==0)return 1;
        if(idx == numbers.length) {return 0;}
        if(numbers[idx] > n) {return f(numbers, n, idx+1);}
        return f(numbers, n, idx+1)+f(numbers, n-numbers[idx], idx+1);
    }
}