import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(sc.next(), 0);
        }
        List<String> b = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String s = sc.next();
            if(map.containsKey(s)) {b.add(s);}
        }
        b.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(b.size());
        b.forEach(System.out::println);
    }
}