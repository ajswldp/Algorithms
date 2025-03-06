import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (sc.nextInt()*60+sc.nextInt()-45+1440)%1440;
        System.out.println(n/60+" "+n%60);
    }
}