import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt() + sc.nextInt();
        long[] arr = new long[a+1];
        long[] tree = new long[a+1];
        for(int i = 1; i <= a; i++) {
            arr[i] = sc.nextLong();
        }
        for(int i = 1; i <= a; i++) {
            tree[i] += arr[i];
            int p = i+(i&-i);
            if(p<=a){
                tree[p] += tree[i];
            }
        }
        for(int i = 0; i < b; i++) {
            boolean bool = sc.nextInt() == 1;
            if(bool) {
                int idx = sc.nextInt();
                long input = sc.nextLong();
                long sub = input - arr[idx];
                arr[idx] = input;
                while(idx<=a){
                    tree[idx] += sub;
                    idx+=idx&(-idx);
                }
            }
            else{
                int s = sc.nextInt()-1, e = sc.nextInt();
                long sum = 0;
                while(e>0){
                    sum += tree[e];
                    e -= e&(-e);
                }
                while(s>0){
                    sum = sum-tree[s];
                    s -= s&(-s);
                }
                System.out.println(sum);
            }
        }
    }
}