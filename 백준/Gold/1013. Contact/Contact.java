import java.util.*;
import java.util.regex.Pattern;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String s = sc.nextLine();
            if(Pattern.matches("(100+1+|01)+", s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}