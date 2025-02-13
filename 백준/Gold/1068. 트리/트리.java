import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tree tree = new Tree(n);
        for(int i = 0; i < n; i++) {
            tree.link(i, sc.nextInt());
        }
        tree.remove(sc.nextInt());
        System.out.println(tree.leaf());
    }
    public static class Tree{
        List<Node> nodeList = new ArrayList<>();
        Node root;
        Tree(int n){
            for(int i = 0;i < n;i++) {
                nodeList.add(new Node());
            }
        }
        void link(int child, int parent) {
            if(parent == -1){
                root = nodeList.get(child);
            }
            else {
                nodeList.get(child).parent = nodeList.get(parent);
                nodeList.get(parent).children.add(nodeList.get(child));
            }
        }
        void remove(int node) {
            if(nodeList.get(node).parent==null) {
                root = null;
            }
            else{
                nodeList.get(node).parent.children.remove(nodeList.get(node));
            }
        }
        int leaf(){
            int count = 0;
            if(root!=null){
                List<Node> bfsNodes = new ArrayList<>();
                bfsNodes.add(root);
                while(!bfsNodes.isEmpty()){
                    Node node = bfsNodes.remove(0);
                    if(node.children.isEmpty())count++;
                    bfsNodes.addAll(node.children);
                }
            }
            return count;
        }
        public static class Node{
            Node parent;
            List<Node> children;
            Node(){
                children = new ArrayList<>();
            }
        }
    }
}