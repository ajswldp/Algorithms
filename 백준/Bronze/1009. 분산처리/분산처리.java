import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), sum = 1;
            while(b-->0){
                sum = (sum * a -1) % 10 + 1;
            }
            System.out.println(sum);
        }
    }
}