
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int n = -sc.nextInt()+sc.nextInt();
            int m = (int)(Math.sqrt(n)*2);
            if((int)Math.sqrt(n)==Math.sqrt(n)){
                m--;
            }
            System.out.println(m);
        }
    }
}