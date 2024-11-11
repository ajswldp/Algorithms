class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] arr = new int[4];
        for(int i = 0;i<survey.length;i++){
            if(survey[i].equals("RT")){
                arr[0]+=choices[i]-4;
            }
            else if(survey[i].equals("TR")){
                arr[0]-=choices[i]-4;
            }
            else if(survey[i].equals("CF")){
                arr[1]+=choices[i]-4;
            }
            else if(survey[i].equals("FC")){
                arr[1]-=choices[i]-4;
            }
            else if(survey[i].equals("JM")){
                arr[2]+=choices[i]-4;
            }
            else if(survey[i].equals("MJ")){
                arr[2]-=choices[i]-4;
            }
            else if(survey[i].equals("AN")){
                arr[3]+=choices[i]-4;
            }
            else if(survey[i].equals("NA")){
                arr[3]-=choices[i]-4;
            }
        }
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
        String s = "";
        if(arr[0]>0)s+="T";
        else s+="R";
        if(arr[1]>0)s+="F";
        else s+="C";
        if(arr[2]>0)s+="M";
        else s+="J";
        if(arr[3]>0)s+="N";
        else s+="A";
        return s;
    }
}