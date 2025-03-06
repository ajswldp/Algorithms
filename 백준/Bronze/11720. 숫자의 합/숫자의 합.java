import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();
        int sum = 0;
        for(char c : s){
            sum+=c-'0';
        }
        System.out.println(sum);
    }
}