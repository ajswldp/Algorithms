import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.println(min+" "+max);
    }
}