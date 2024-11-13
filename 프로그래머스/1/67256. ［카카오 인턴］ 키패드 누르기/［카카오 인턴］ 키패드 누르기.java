class Solution {
    public String solution(int[] numbers, String hand) {
        String s = "";
        int[] lh = new int[]{0, 3};
        int[] rh = new int[]{2, 3};
        for(int num: numbers){
            if(num==0)num = 11;
            //System.out.println(lh[0]+" "+lh[1]+" "+rh[0]+" "+rh[1]+" "+num);
            if(num%3==1){
                lh[0] = 0;
                lh[1] = num/3;
                s+="L";
            }
            else if(num%3 ==2){
                int lhl = Math.abs(1-lh[0])+Math.abs(num/3-lh[1]);
                int rhl = Math.abs(1-rh[0]) + Math.abs(num/3-rh[1]);
                if(lhl<rhl||(lhl==rhl&&hand.equals("left"))){
                    lh[0] = 1;
                    lh[1] = num/3;
                    s+="L";
                }
                else {
                    rh[0] = 1;
                    rh[1] = num/3;
                    s+="R";
                }
            }
            else {
                rh[0] = 2;
                rh[1] = num/3-1;
                s+="R";
            }
        }
        return s;
    }
}