import java.util.*;

class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String>[] list = new List[201];
        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            String b = sc.next();
            list[a].add(b);
        }
        for(int i = 0; i < list.length; i++){
            int finalI = i;
            list[i].forEach(val->System.out.println(finalI +" "+val));
        }
    }
}