import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[][] arr = new int[friends.length][friends.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i] ,i);
        }
        for(String gift: gifts){
            String[] giftArr = gift.split(" ");
            arr[map.get(giftArr[0])][map.get(giftArr[1])]++;
        }
        int[] numArr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                numArr[i]-=arr[i][j];
                numArr[i]+=arr[j][i];
            }
        }
        int[] now = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i][j]==0&&arr[j][i]==0||arr[i][j]==arr[j][i]){
                    if(numArr[i]>numArr[j])now[j]++;
                    else if(numArr[i]<numArr[j])now[i]++;
                }
                else{
                    if(arr[i][j]<arr[j][i])now[j]++;
                    else now[i]++;
                }
                
                //System.out.println(Arrays.toString(now));
            }
        }
        Arrays.sort(now);
        return now[now.length-1];
    }
}