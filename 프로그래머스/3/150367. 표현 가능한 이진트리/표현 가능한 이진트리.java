import java.util.*;

class Solution {
    public int[] solution(long[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(long number : numbers) {
            
            if(number == 0){
                list.add(0);
                continue;
            }
            String s = "";
            while(number != 0) {
                s = number%2 + s;
                number /= 2;
            }
            int num = 1;
            int cont = 1;
            while(num-1<s.length()) {
                num<<=1;
                cont++;
            }
            while(num-1>s.length()){
                s = '0'+s;
            }
            if(f(s, true)){
                list.add(1);
            }
            else{
                list.add(0);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public boolean f(String s, boolean flag) {
        if(flag) {
            if(s.length() == 1) {
                return true;
            }
            if(s.charAt(s.length()/2) == '1') {
                return f(s.substring(0, s.length()/2), true)&&f(s.substring(s.length()/2+1), true);
            }
            else{
                return f(s.substring(0, s.length()/2), false)&&f(s.substring(s.length()/2+1), false);
            }
        }
        else{
            if(s.length() == 1) {
                return s.equals("0");
            }
            if(s.charAt(s.length()/2) == '1') {
                return false;
            }
            else{
                return f(s.substring(0, s.length()/2), false)&&f(s.substring(s.length()/2+1), false);
            }
        }
    }
}