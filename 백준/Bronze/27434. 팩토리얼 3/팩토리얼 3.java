
import java.math.BigInteger;
import java.util.Arrays;
import java.util.*;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(1, n));
    }
    public static BigInteger f(int s, int e){
        if(e<2)return new BigInteger("1");
        if(s==e)return new BigInteger(String.valueOf(s));
        return f(s, (s+e)/2).multiply(f((s+e)/2+1, e));
    }
}