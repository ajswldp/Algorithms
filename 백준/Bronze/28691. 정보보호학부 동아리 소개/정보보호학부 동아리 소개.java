
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        switch (sc.next()){
            case ("W"):
                s = "WiCys";
                break;
            case ("M"):
                s = "MatKor";
                break;
            case ("C"):
                s = "CyKor";
                break;
            case ("A"):
                s = "AlKor";
                break;
            case ("$"):
                s = "$clear";
        }
        System.out.print(s);
    }
}