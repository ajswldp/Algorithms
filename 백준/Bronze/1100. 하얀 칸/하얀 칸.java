import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
            if(i%2==1){
                arr[i] = arr[i].substring(1);
            }
            char[] charArr = arr[i].toCharArray();
            for(int j = 1; j < charArr.length; j+=2){
                charArr[j] = 0;
            }
            arr[i] = String.valueOf(charArr);
        }
        char[] charArr = Arrays.stream(arr).reduce((a, b)->a+b).get().toCharArray();
        int cont = 0;
        for(char c : charArr){
            if(c=='F')cont ++;
        }
        System.out.println(cont);
    }
}