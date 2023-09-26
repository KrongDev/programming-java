import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Silver4Card2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> stack = new LinkedList<>();

        for (int i = 1; i <=N; i++) {
            stack.add(i);
        }

        while (stack.size() != 1) {
            stack.poll();
            int a  = stack.poll();
            stack.add(a);
        }

        System.out.println(stack.poll());
    }
}
