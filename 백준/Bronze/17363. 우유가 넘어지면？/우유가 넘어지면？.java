import java.util.*;

class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder p = new StringBuilder();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = str[0].length()-1; i >=0; i--) {
            for(int j = 0; j < n; j++) {
                switch (str[j].charAt(i)){
                    case '-':
                        p.append("|");
                        break;
                    case '|':
                        p.append("-");
                        break;
                    case '/':
                        p.append("\\");
                        break;
                    case '\\':
                        p.append("/");
                        break;
                    case '^':
                        p.append("<");
                        break;
                    case '<':
                        p.append("v");
                        break;
                    case 'v':
                        p.append(">");
                        break;
                    case '>':
                        p.append("^");
                        break;
                    default:
                        p.append(str[j].charAt(i));
                        break;

                }
            }
            p.append('\n');
        }
        p = p.deleteCharAt(p.length() - 1);
        System.out.print(p);
    }
}