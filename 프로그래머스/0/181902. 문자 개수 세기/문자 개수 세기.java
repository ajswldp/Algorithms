
class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[52];
        for(char c:my_string.toCharArray()){
            int a = (c+1<'a'+1)?arr[c-'A']++:arr[c+26-'a']++;
        }
        return arr;
    }
}