
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt() + sc.nextInt();
        BigInteger[] arr = new BigInteger[a+1];
        BigInteger[] tree = new BigInteger[a+1];
        for(int i = 1; i <= a; i++) {
            arr[i] = sc.nextBigInteger();
            tree[i] = BigInteger.ZERO;
        }
        for(int i = 1; i <= a; i++) {
            tree[i] = arr[i].add(tree[i]);
            int p = i+(i&-i);
            if(p<=a){
                tree[p] = tree[p].add(tree[i]);
            }
        }
        for(int i = 0; i < b; i++) {
            boolean bool = sc.nextInt() == 1;
            if(bool) {
                //바꾸기
                int idx = sc.nextInt();//능딸이라 구현 못하는중
                BigInteger input = sc.nextBigInteger();
                BigInteger sub = input.subtract(arr[idx]);
                arr[idx] = input;
                while(idx<=a){
                    tree[idx] = tree[idx].add(sub);
                    idx+=idx&(-idx);
                }
            }
            else{
                int s = sc.nextInt()-1, e = sc.nextInt();
                BigInteger sum = BigInteger.ZERO;
                while(e>0){
                    sum = sum.add(tree[e]);
                    e -= e&(-e);
                }
                while(s>0){
                    sum = sum.subtract(tree[s]);
                    s -= s&(-s);
                }
                System.out.println(sum);
            }
        }
    }
}