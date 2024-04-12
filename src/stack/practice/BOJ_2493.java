package stack.practice;

import java.io.*;
import java.util.Arrays;

public class BOJ_2493 {
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] results = new int[N];

        Stack stack = new Stack();

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.empty() && inputs[i] > inputs[stack.top()]) {
                int j = stack.pop();
                results[j] = i + 1;
            }
            stack.push(i);
        }

        for (int result : results) {
            bw.write(result + "");
            bw.write(" ");
        }
        bw.close();
    }
    
    static class Stack {
        private int[] arr = new int[500_001];
        private int cursor = 0;
        
        public void push(int input) {
            arr[++cursor] = input;
        }
        
        public int pop() {
            return arr[cursor--];
        }
        
        public int top() {
            return arr[cursor];
        }
        
        public boolean empty() {
            return cursor == 0;
        }
    }
}
