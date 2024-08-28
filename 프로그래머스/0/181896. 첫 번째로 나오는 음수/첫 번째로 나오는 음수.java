class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(;answer<num_list.length;answer++){
            if(num_list[answer]<0)return answer;
        }
        return -1;
    }
}