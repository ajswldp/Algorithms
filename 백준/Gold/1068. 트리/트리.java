import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        int r = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a==-1) r = i;
            else list.get(a).add(i);
        }
        int d = sc.nextInt();
        list.set(d, new ArrayList<>());
        list.forEach(a-> a.removeIf(b->b==d));
        if(r==d){
            System.out.println(0);
            return;
        }
        System.out.println(f(list, r));
    }
    public static int f(List<List<Integer>> list, int r){
        AtomicInteger num = new AtomicInteger();
        if(list.get(r).isEmpty()) return 1;
        list.get(r).forEach(a-> num.addAndGet(f(list, a)));
        return num.get();
    }
}