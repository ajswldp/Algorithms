class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int sum = 0;
        int cont = 10000;
        for(int i = 0;i<rank.length;i++){
            int min = 0;
            for(int j = 1;j<rank.length;j++){
                if(rank[min]>rank[j])min = j;
            }
            if(attendance[min]){
                if(cont==10000){
                    sum+=min*cont;
                    cont = 100;
                }
                else if(cont == 100){
                    sum+=min*cont;
                    cont = 1;
                }
                else{
                    return sum+min;
                }
            }
            rank[min] = 101;
        }
        return sum;
    }
}