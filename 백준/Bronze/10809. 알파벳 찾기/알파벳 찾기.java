import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String s = sc.nextLine();
        for(int i = 0; i < 26; i++){
            arr[i] = s.indexOf((char)(i+'a'));
        }
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}