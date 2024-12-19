import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cont = 0;
        while (n != 0) {
            cont += n % 2;
            n >>= 1;
        }
        System.out.println(cont);
    }
}