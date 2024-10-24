class Solution {
    public String solution(String polynomial) {
        int x = 0, num = 0;
        String[] arr =polynomial.split(" \\+ ");
        for(String s:arr){
            if(s.charAt(s.length()-1)=='x'){
                if(s.length()==1)x++;
                else x+=Integer.parseInt(s.substring(0,s.length()-1));
            }
            else{
                num+=Integer.parseInt(s);
            }
        }
        String returnString = "";
        if(x>1)returnString+=x;
        if(x>0)returnString+="x";
        if(num>0&&x>0)returnString+=" + ";
        if(num>0)returnString+=num;
        return returnString;
    }
}