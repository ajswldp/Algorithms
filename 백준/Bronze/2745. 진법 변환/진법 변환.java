import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sArr = sc.nextLine().split(" ");
        Map<Character, Integer> map = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++) {
            map.put(c, c-'A'+10);
        }
        for(char c = '0'; c <= '9'; c++) {
            map.put(c, c-'0');
        }
        int n = Integer.parseInt(sArr[1]);
        int sum = 0;
        for(int i = 0; i < sArr[0].length(); i++) {
            sum = sum*n+map.get(sArr[0].charAt(i));
        }
        System.out.println(sum);
    }
}