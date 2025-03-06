import java.util.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();
        int count = 0;
        Set<Integer> set = new HashSet<>();
        set.add(a*100+b);
        while (!set.contains(c*100+d)){
            count++;
            Set<Integer> set2 = new HashSet<>();
            set.forEach(val->{
                set2.add(val+200+1);
                set2.add(val+100+2);
                set2.add(val+200-1);
                set2.add(val+100-2);
                set2.add(val-200+1);
                set2.add(val-100+2);
                set2.add(val-200-1);
                set2.add(val-100-2);
            });
            set = set2.stream().filter(val->val/100<9&&val/100>0&&val%10<9&&val%10>0).collect(Collectors.toSet());
        }
        System.out.println(count);
    }
}