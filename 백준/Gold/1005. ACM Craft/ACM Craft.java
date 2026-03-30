import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Tree tree = new Tree(n, arr);
            for(int i = 0; i < m; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                tree.nodes.get(b-1).children.add(tree.nodes.get(a-1));
            }
            tree.root = tree.nodes.get(sc.nextInt()-1);
            System.out.println(tree.root.max());
        }
    }
    static class Tree{
        Node root;
        List<Node> nodes = new ArrayList<>();
        Tree(int n, int[] arr){
            for(int i=0; i<n; i++){
                nodes.add(new Node(arr[i]));
            }
        }
        static class Node{
            int max(){
                if(children.isEmpty())return data;
                if(sum!=-100)return sum;
                List<Integer> list = new ArrayList<>();
                for(Node child : children){
                    list.add(child.max());
                }
                return sum = Collections.max(list)+data;
            }
            int data;
            int sum = -100;
            List<Node> children = new ArrayList<>();
            Node(int d){
                data = d;
            }
        }
    }
}