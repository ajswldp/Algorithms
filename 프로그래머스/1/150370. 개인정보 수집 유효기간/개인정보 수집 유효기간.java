/*
.을 기준으로 문자열을 다 잘라 y, m, d로 나눈다.
privacies는 A일때 terms의 m에 3을 더하고 ...

*/
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList();
        Map<Character, Integer> map = new HashMap();
        for(String str:terms){
            map.put(str.charAt(0), Integer.parseInt(str.substring(2, str.length())));
        }
        int intToday = f(today);
        for(int i = 0;i<privacies.length; i++){
            int num = f(privacies[i], map);
            if(num<=intToday){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public int f(String str){
        int[] arr = Arrays.stream(str.split("\\.")).mapToInt(Integer::parseInt).toArray();
        return arr[0]*12*28+arr[1]*28+arr[2];
    }
    public int f(String str, Map map){
        String str1 = str.substring(0, 10)+"."+map.get(str.charAt(11));
        int[] arr = Arrays.stream(str1.split("\\.")).mapToInt(Integer::parseInt).toArray();
        return arr[0]*12*28+arr[1]*28+arr[3]*28+arr[2];
    }
}