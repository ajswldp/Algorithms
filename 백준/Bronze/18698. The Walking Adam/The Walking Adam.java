import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String s = "d"+sc.nextLine();
            System.out.println(s.split("D")[0].length()-1);
        }
    }
}