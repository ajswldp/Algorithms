import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int b = sc.nextInt();
            if(a > b){
                System.out.print(b+" ");
            }
        }
    }
}