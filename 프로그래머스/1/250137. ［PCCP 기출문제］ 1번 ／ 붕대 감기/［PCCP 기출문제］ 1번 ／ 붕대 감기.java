class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int hp = health;
        for(int[] attack:attacks){
            //System.out.println("원래  hp:"+hp);
            hp+=(attack[0]-time)*bandage[1]+(attack[0]-time)/bandage[0]*bandage[2];
            time = attack[0]+1;
            if(hp>health)hp = health;
            //System.out.println("회복  hp:"+hp);
            hp-=attack[1];
            //System.out.println("어택  hp:"+hp);
            if(hp<=0)return -1;
        }
        return hp;
    }
}