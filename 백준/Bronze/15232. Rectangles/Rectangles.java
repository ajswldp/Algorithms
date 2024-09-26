import java.util.*;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < a; i++){
            System.out.println(Stream.iterate("*", A->A).limit(b).reduce("", (A,B)->A+B));
        }
    }
}