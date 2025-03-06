import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        set.add(sc.nextInt()%42);
        System.out.println(set.size());
    }
}