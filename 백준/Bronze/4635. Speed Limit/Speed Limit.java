import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        do{
            int sum = 0;
            int time = 0;
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                int t = sc.nextInt();
                sum += num * (t-time);
                time = t;
            }
            System.out.println(sum + " miles");
            N = sc.nextInt();
        }while (N!=-1);
    }
}