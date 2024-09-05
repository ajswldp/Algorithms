import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        for(int i = 0;i<5;i++){
            s[i] = sc.nextLine();
        }
        for(int i = 0;i<20;i++){
            for(int j = 0;j<5;j++){
                if(s[j].length()>i)System.out.print(s[j].charAt(i));
            }
        }
    }
}