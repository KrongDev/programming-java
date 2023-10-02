import java.io.IOException;
import java.util.Scanner;

public class Silver4요세푸스 {

    static StringBuilder sb = new StringBuilder();

    static class Node {
        private int data;
        private Node prev;
        private Node child;

        public Node(int data,Node prev, Node child) {
            this.data = data;
            this.prev = prev;
            this.child = child;
        }

        public int getData() {
            //
            return this.data;
        }

        public Node getChild() {
            //
            return this.child;
        }

        public void add(int data) {
            for(Node temp = this; temp != null; temp = temp.child) {
                if(temp.child == null) {
                    temp.child = new Node(data, temp, null);
                    break;
                }
            }
        }

        public int length() {
            int i = 0;
            for (Node temp = this; temp != null; temp = temp.child) {
                i++;
            }
            return i;
        }

        public void remove(int data) {
            for (Node temp = this; temp != null; temp = temp.child) {
                if(temp.data == data) {
                    temp.prev.child = temp.child;
                    if(temp.child != null) {
                        temp.child.prev = temp.prev;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Node node = new Node(0, null,null);

        for(int i = 1; i <= N; i++) {
            node.add(i);
        }

        sb.append("<");
        int[] s = new int[N];
        int len = 0;
        int i = K;
        for(Node temp = node.child; temp != null; temp = temp.child) {
            i--;
            if(i == 0) {
                i = K;
                s[len] = temp.getData();
                len++;
                node.remove(temp.getData());
            }
            if(temp.child == null) {
                temp = node;
            }
        }

        sb.append(s[0]);

        for(int j = 1; j < s.length; j++) {
            sb.append(", ").append(s[j]);
        }
        sb.append(">");

        System.out.println(sb);
    }
}
