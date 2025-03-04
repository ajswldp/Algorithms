import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            a = Integer.min(sc.nextInt(), a);
            b = Integer.min(sc.nextInt(), b);
        }
        if(a>=b*6){
            System.out.println(n*b);
            return;
        }
        if(a<n%6*b){
            System.out.println(n/6*a+(n%6==0?0:a));
        }
        else{
            System.out.println(n%6*b+n/6*a);
        }
    }
}