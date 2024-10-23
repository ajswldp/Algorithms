class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i=0;i<picture.length;i++){
            StringBuilder s = new StringBuilder();
            for(int j=0;j<picture[i].length();j++){
                for(int m=0;m<k;m++){
                    s.append(picture[i].charAt(j));
                }
            }
            for(int j = 0;j<k;j++){
                answer[i*k+j] = s.toString();
            }
        }
        return answer;
    }
}