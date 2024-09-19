import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for(char c:sc.next().toCharArray()) {
            num = (num * 10 + c - '0')%20000303;
        }
        System.out.println(num);
    }
}