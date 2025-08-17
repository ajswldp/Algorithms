import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        Queue<LinkedList<Integer>> q = new LinkedList<>();
        if(maps[0][0] == 0) return -1;
        q.add(new LinkedList<>(Arrays.asList(0, 0, 0)));
        maps[0][0] = 0;
        while(!q.isEmpty()){
            List<Integer> temp = q.poll();
            int x = temp.get(0);
            int y = temp.get(1);
            int step = temp.get(2);
            if(x == maps.length-1 && y == maps[0].length-1) return step+1;
            
            if(x < maps.length-1 && maps[x+1][y] == 1){
                maps[x+1][y] = 0;
                q.add(new LinkedList<>(Arrays.asList(x+1,y,step+1)));
            }
            if(y < maps[0].length-1 && maps[x][y+1] == 1){
                maps[x][y+1] = 0;
                q.add(new LinkedList<>(Arrays.asList(x,y+1,step+1)));
            }
            if(x > 0 && maps[x-1][y] == 1){
                maps[x-1][y] = 0;
                q.add(new LinkedList<>(Arrays.asList(x-1,y,step+1)));
            }
            if(y > 0 && maps[x][y-1] == 1){
                maps[x][y-1] = 0;
                q.add(new LinkedList<>(Arrays.asList(x,y-1,step+1)));
            }
        }
        return -1;
    }
}