class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int i1 = priorities.length-1;
        int i2 = 10;
        for(int i = priorities.length-1;;i++){
            i%=priorities.length;
            if(priorities[i]==i2){
                priorities[i]=0;
                answer++;
                i1 = i;
            }
            else{
                if(i==i1)i2--;
            }
            
            if(priorities[location]==0)return answer;
        }
        
    }
}