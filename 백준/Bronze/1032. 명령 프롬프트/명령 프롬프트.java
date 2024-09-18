import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        for(int i = 0; i < arr[0].length(); i++){
            boolean flag = true;
            for(int j = 0; j < arr.length; j++){
                if(arr[j].charAt(i) != arr[0].charAt(i)){
                    flag = false;
                }
            }
            System.out.print(flag?arr[0].charAt(i):"?");
        }
    }
}