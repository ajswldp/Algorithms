import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum()*5);
    }
}