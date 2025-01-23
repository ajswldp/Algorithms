import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.next());
        }
        List<String> b = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            b.add(sc.next());
        }
        a.removeAll(b);
        System.out.println(a.get(0));
    }
}