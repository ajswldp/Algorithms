import java.util.*;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            int n = sc.nextInt();
            if((n+1)%(n%100) == 0) System.out.println("Good");
            else System.out.println("Bye");
        }
    }
}