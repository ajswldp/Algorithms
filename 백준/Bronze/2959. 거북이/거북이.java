
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.sort(Collections.reverseOrder());
        System.out.println(list.get(1)*list.get(3));
    }
}