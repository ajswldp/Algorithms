import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int n1 = sc.nextInt();
            String str = sc.next();
            for(int i = 0; i < str.length(); i++) {
                for(int j = 0; j < n1; j++){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}