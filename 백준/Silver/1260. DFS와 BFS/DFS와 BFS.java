import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
                m = sc.nextInt(),
                s = sc.nextInt()-1;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        //DFS
        boolean[] DFS = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(!stack.empty()){
            int node = stack.pop();
            if(DFS[node]){
                continue;
            }
            DFS[node] = true;
            graph.get(node).sort(Comparator.reverseOrder());
            graph.get(node).forEach(a->{
                if(!DFS[a]){
                    stack.push(a);
                }
            });
            System.out.print(1+node+" ");
        }
        System.out.println();

        //BFS
        boolean[] BFS = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        while(!q.isEmpty()){
            int node = q.poll();
            BFS[node] = true;
            graph.get(node).sort(Comparator.naturalOrder());
            graph.get(node).forEach(a->{
                if(!BFS[a]&&!q.contains(a)){
                    q.offer(a);
                }
            });
            System.out.print(1+node+" ");
        }
    }
}