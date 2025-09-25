import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0)return cities.length * 5;
        Cache cache = new Cache(cacheSize);
        for(String s : cities){
            if(cache.contains(s.toLowerCase())){
                answer++;
            }
            else{
                answer += 5;
            }
            cache.add(s.toLowerCase());   
        }
        return answer;
    }
    class Cache{
        int cacheSize;
        List<String> cacheList;

        public Cache(int cacheSize){
            this.cacheSize = cacheSize;
            this.cacheList = new ArrayList<>();
        }
        public void add(String s){
            if(cacheList.contains(s)){
                cacheList.remove(s);
                cacheList.add(s);
                return;
            }
            if(cacheList.size() == cacheSize){
                cacheList.remove(0);
            }
            cacheList.add(s);
        }
        public boolean contains(String s){
            return cacheList.contains(s);
        }
    }
}