package stack.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_10773 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws Exception {
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N != 0) {
                stack.pop();
                continue;
            }
            stack.push(N);
        }
        int sum = stack.stream().mapToInt(n -> n).sum();
        bw.write(sum + "");
        
        br.close();
        bw.close();
    }
}

