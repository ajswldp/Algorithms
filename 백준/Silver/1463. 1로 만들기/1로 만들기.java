
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[sc.nextInt()+1];
        System.out.println(f(arr.length-1));
    }
    public static int f(int n) {
        if(arr[n] != 0) {return arr[n];}
        if(n==1) return arr[1] = 0;
        List<Integer>list = new ArrayList<>();
        if(n%3==0) list.add(f(n/3));
        if(n%2==0) list.add(f(n/2));
        list.add(f(n-1));
        return arr[n] = list.stream().min(Integer::compare).get()+1;
    }
}