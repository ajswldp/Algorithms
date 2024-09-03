class Solution {
    public int solution(String before, String after) {
        for(char c:before.toCharArray()){
            after = after.replaceFirst(c+"", "");
        }
        if(after.equals(""))return 1;
        return 0;
    }
}