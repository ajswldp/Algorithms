import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int sum = 0;
        int min1 = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++) {
            if(isPrime(i)){
                if(min1 == 0){
                    min1 = i;
                }
                sum += i;
            }
        }
        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min1);
        }
    }
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i <= n>>1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}