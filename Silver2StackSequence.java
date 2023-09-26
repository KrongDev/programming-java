import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Silver2StackSequence {

    static public void popAction(Queue<Integer> queue, Stack<Integer> stack, StringBuilder sb) {
        if(queue.isEmpty() || stack.isEmpty()) return;
        int q = queue.peek();
        int s = stack.peek();
        if(q == s) {
            queue.poll();
            stack.pop();
            sb.append("-").append("\n");
            popAction(queue, stack, sb);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int line = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < line; i++) {
            queue.add(sc.nextInt());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <=line; i++)  {

            stack.push(i);
            sb.append("+").append("\n");

            popAction(queue, stack, sb);

        }

        if (!queue.isEmpty() || !stack.isEmpty()) {
            System.out.println("NO");
        }
        else {
            System.out.println(sb);
        }
    }
}
