import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver44949 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        //
        while (true) {
            String s = br.readLine();
            if(".".equals(s)) {
                break;
            }

            Stack<String> stack = new Stack<>();
            String[] data = s.split("");
            boolean check = false;
            for(String str: data) {
                if("(".equals(str)) {
                    stack.push(str);
                }
                else if(")".equals(str)) {
                    if(stack.isEmpty() || !"(".equals(stack.pop())) {
                        check = true;
                        break;
                    }
                }
                else if("[".equals(str)) {
                    stack.push(str);
                }
                else if("]".equals(str)) {
                    if(stack.isEmpty() || !"[".equals(stack.pop())) {
                        check = true;
                        break;
                    }
                }
            }

            if(check || !stack.isEmpty()) {
                sb.append("no").append("\n");
                continue;
            }

            sb.append("yes").append("\n");
        }
     System.out.println(sb);
    }

}
