import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] c = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        System.out.println((c[0]-a[2])+" "+(c[1]/a[1])+" "+(c[2]-a[0]));
    }
}