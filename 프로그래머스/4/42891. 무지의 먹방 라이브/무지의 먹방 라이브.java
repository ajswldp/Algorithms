class Solution {
    public int solution(int[] food_times, long k) {
        int no0Length = food_times.length;
        long sum = 0;
        for(int i = 0;i<food_times.length;i++){
            sum+=food_times[i];
        }
        
        if(k>=sum)return -1;
        
        
        while(no0Length<=k){
            long j = k/no0Length;
            for(int i = 0;i<food_times.length;i++){
                if(food_times[i]==0)continue;
                if(food_times[i]<=j){
                    k-=food_times[i];
                    food_times[i] = 0;
                    no0Length--;
                    
                }
                else{
                    food_times[i]-=j;
                    k-=j;
                }
                
            }
        }
        System.out.println(k);
        int answer = 0;
        for(int i = 0;i<food_times.length;i++){
            if(food_times[i]==0)continue;
            if(k==0)answer=i;
            k--;
            
        }
        return ++answer;
    }
}