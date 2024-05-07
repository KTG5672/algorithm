package deque.exam;

import java.io.*;

public class BOJ_10866 {
    
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws Exception {
        
        int N = Integer.parseInt(br.readLine());
        Deque deque = new Deque();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            String[] commands = command.split(" ");
            int input = 0;
            if (commands.length > 1) {
                input = Integer.parseInt(commands[1]);
            }
            switch (commands[0]) {
                case "push_front" :
                    deque.push_front(input);
                    break;
                case "push_back" :
                    deque.push_back(input);
                    break;
                case "pop_front" :
                    print(deque.pop_front());
                    break;
                case "pop_back" :
                    print(deque.pop_back());
                    break;
                case "size" :
                    print(deque.size());
                    break;
                case "empty" :
                    print(deque.empty());
                    break;
                case "front" :
                    print(deque.front());
                    break;
                case "back" :
                    print(deque.back());
                    break;
            }
        }
        br.close();
        bw.close();
    }
    
    private static void print(int data) throws IOException {
        bw.write(data + "");
        bw.newLine();
    }
    
    static class Deque {
        
        private final int MAX = 10_001;
        private int data[] = new int[MAX * 2 + 1];
        private int tail = MAX;
        private int head = MAX;
        
        
        public void push_front(int input) {
            data[--head] = input;
        }
        
        public void push_back(int input) {
            data[tail++] = input;
        }
        
        public int pop_front() {
            if (empty() == 1) {
                return -1;
            }
            return data[head++];
        }
        
        public int pop_back() {
            if (empty() == 1) {
                return -1;
            }
            return data[--tail];
        }
        
        public int size() {
            return tail - head;
        }
        
        public int empty() {
            return tail - head <= 0 ? 1 : 0;
        }
        
        public int front() {
            if (empty() == 1) {
                return -1;
            }
            return data[head];
        }
        
        public int back() {
            if (empty() == 1) {
                return -1;
            }
            return data[tail - 1];
        }
    }
}
