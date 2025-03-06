import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            List<Integer> list = new ArrayList<>();
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            if(list.get(0)==list.get(1)&&list.get(2)==list.get(1)&&list.get(0)==0){return;}
            Collections.sort(list);
            if(list.get(0)*list.get(0)+list.get(1)*list.get(1)==list.get(2)*list.get(2)){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
    }
}