import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),
                y = sc.nextInt(),
                a = sc.nextInt(),
                b = sc.nextInt();
        System.out.println(Math.min(Math.min(x,y),Math.min(a-x, b-y)));
    }
}