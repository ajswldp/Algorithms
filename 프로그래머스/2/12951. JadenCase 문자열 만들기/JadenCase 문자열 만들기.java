import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = ("a "+s.toLowerCase()+" a").split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() == 0){
                continue;
            }
            if(arr[i].charAt(0)>='a'&&arr[i].charAt(0)<='z'){
                arr[i] =((char)(arr[i].charAt(0)-32))+arr[i].substring(1);
            }
        }
        String ans = Arrays.stream(arr).reduce((a, b)->a+" "+b).orElse("");
        return ans.substring(2,ans.length()-2);
    }
}