import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver3_1966 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static class Node{
        //중요도
        private final int data;
        private boolean header;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, boolean header) {
            this.data = data;
            this.header = header;
        }

        public int getData() {
            return this.data;
        }

        public boolean isHeader() {
            return this.header;
        }
    }

    public static void main(String[] args) throws IOException {
        //
        int N = Integer.parseInt(br.readLine());

        while (N --> 0) {
            st = new StringTokenizer(br.readLine());

            int len = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            Queue<Node> queue = new LinkedList<>();
            for (int i = 0; i < len; i++) {
                int data =Integer.parseInt(st.nextToken());
                queue.add(new Node(
                        data,
                        i == index
                ));
            }

            int answer = 0;
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                boolean check = false;
                for (Object data: queue.toArray()) {
                    if (((Node) data).getData() > node.getData()) {
                        check = true;
                        break;
                    }
                }
                if(check) {
                    queue.add(node);
                    continue;
                }

                answer++;
                if(node.isHeader()) {
                    break;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
