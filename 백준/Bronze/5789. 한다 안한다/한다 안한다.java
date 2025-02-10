import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String line = sc.nextLine();
            if(line.charAt(line.length()/2)==line.charAt(line.length()/2-1))
                System.out.println("Do-it");
            else
                System.out.println("Do-it-Not");
        }

    }
}