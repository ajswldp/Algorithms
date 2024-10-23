class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int num = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i+=2) {
            if(arr[i].equals("+")){
                num += Integer.parseInt(arr[i+1]);
            }
            else{
                num -= Integer.parseInt(arr[i+1]);
            }
        }
        return num;
    }
}