import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        long[] s1 = new long[s.length];
        for(int i = 0;i<s.length;i++){
            String S = (s[i]+s[i]+s[i]+s[i]+s[i]+s[i]+s[i]+s[i]+s[i]+s[i]).substring(0, 10);
            s1[i] = Long.parseLong(
                    S
            );
        }
        String print = "";
        for(int i = 0;i<s.length;i++){
            long num = -1;
            int idx = 0;
            for(int j = 0;j<s.length;j++){
                if(s1[j]>num){
                    num = s1[j];
                    idx = j;
                }
            }
            if(!(print.equals("0")&&s[idx].equals("0"))) print+=s[idx];
            s1[idx] = -1;
        }
        System.out.println(print);
    }
}