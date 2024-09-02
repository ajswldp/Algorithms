
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int back = 0;
        while (N-- > 0) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push")) {
                queue.add(Integer.parseInt(s[1]));
                back = Integer.parseInt(s[1]);
            } else if (s[0].equals("front")) {
                sb.append((queue.isEmpty() ? -1 : queue.peek()) + "\n");
            } else if (s[0].equals("back")) {
                sb.append((queue.isEmpty() ? -1 : back) + "\n");
            } else if (s[0].equals("empty")) {
                sb.append((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (s[0].equals("size")) {
                sb.append(queue.size() + "\n");
            } else {
                sb.append((queue.isEmpty() ? -1 : queue.poll()) + "\n");
            }
        }
        System.out.print(sb);

    }
}