import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            int sum = 0;
            int count = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'O') count++;
                else count = 0;
                sum += count;
            }
            System.out.println(sum);
        }
    }
}