import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        Arrays.sort(nums);
        int k = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=k){
                answer++;
                k=nums[i];
            }
        }
        return (answer>nums.length/2)?nums.length/2:answer;
    }
}