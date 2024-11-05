import java.util.Arrays;

class Solution {
    public String solution(String s, int n) {

        String[] arr = (s+"a").split(" ");
        for(int i = 0; i < arr.length; i++) {
            char[] c = arr[i].toCharArray();
            for(int j = 0; j < c.length; j++) {
                if(c[j]<='Z')c[j] = (char)((c[j]-'A'+n)%26+'A');
                else c[j] = (char)((c[j]-'a'+n)%26+'a');
            }
            arr[i] = String.valueOf(c);
            if(i==arr.length-1)arr[i] = arr[i].substring(0, arr[i].length()-1);
        }
        return Arrays.stream(arr).reduce("", (a,b)->a+" "+b).substring(1);
    }
}