import java.util.Arrays;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLenInt = StringToInt(video_len);
        int now = StringToInt(pos);
        int opStartInt = StringToInt(op_start);
        int opEndInt = StringToInt(op_end);
        for(String command:commands) {
            if(opStartInt<=now&&now<opEndInt){
                now = opEndInt;
            }
            if(command.charAt(0)=='n'){
                now+=10;
                if(now>videoLenInt){
                    now = videoLenInt;
                }
            }
            else{
                now-=10;
                if(now<0){
                    now=0;
                }
            }
        }
        if(opStartInt<=now&&now<opEndInt){
            now = opEndInt;
        }
        String s = now/60+":";
        if(now<600){s = "0"+s;}
        if(now%60<10){s+=0;}
        return s+now%60;
    }
    public int StringToInt(String s){
        int[] arr = Arrays.stream(s.split(":")).mapToInt(Integer::parseInt).toArray();
        return arr[0]*60+arr[1];
    }
}