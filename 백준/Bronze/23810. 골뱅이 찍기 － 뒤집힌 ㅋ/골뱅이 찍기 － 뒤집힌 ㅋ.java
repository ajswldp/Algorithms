
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f5(n);
        f1(n);
        f5(n);
        f1(n);
        f1(n);

    }
    public static void f1(int n){
        String s = "";
        for(int i = 0;i<n;i++){
            s+="@";
        }
        for(int i = 0;i<n;i++){
            System.out.println(s);
        }
    }
    public static void f5(int n){
        String s = "";
        for(int i = 0;i<n;i++){
            s+="@@@@@";
        }
        for(int i = 0;i<n;i++){
            System.out.println(s);
        }
    }
}