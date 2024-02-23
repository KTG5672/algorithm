package stack.practice;

import java.io.*;
import java.util.Stack;

public class BOJ_10828 {
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] command = br.readLine().split(" ");
            String cmd = command[0];
            Integer data = null;
            if (command.length > 1) {
                data = Integer.parseInt(command[1]);
            }
            switch (cmd) {
                case "push":
                    stack.push(data);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        print(-1);
                        break;
                    }
                    print(stack.pop());
                    break;
                case "size":
                    print(stack.size());
                    break;
                case "empty":
                    print(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        print(-1);
                        break;
                    }
                    print(stack.peek());
                    break;
            }
        }
        
        br.close();
        bw.close();
    }
    
    private static void print(Integer data) throws IOException {
        bw.write(data + "");
        bw.newLine();
    }
    
}
