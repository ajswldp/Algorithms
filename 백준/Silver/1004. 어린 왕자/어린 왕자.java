import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int n = sc.nextInt();
            int cont = 0;
            while(n-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int r = sc.nextInt();
                if(f(x, y, x1, y1, r)&&!f(x, y, x2, y2, r)||f(x, y, x2, y2, r)&&!f(x, y, x1, y1, r)){
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
    public static boolean f (int x, int y, int x1, int y1, int r){
        return (x-x1)*(x-x1)+(y-y1)*(y-y1)<r*r;
    }
}