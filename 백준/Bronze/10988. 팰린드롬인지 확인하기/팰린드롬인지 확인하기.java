import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}