package queue.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_18258 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws Exception {
        
        int N = Integer.parseInt(br.readLine());
        Queue queue = new Queue();
        
        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            String cmd = command[0];
            int data = 0;
            if (command.length > 1) {
                data = Integer.parseInt(command[1]);
            }
            switch (cmd) {
                case "push" :
                    queue.push(data);
                    break;
                case "pop" :
                    print(queue.pop());
                    break;
                case "size" :
                    print(queue.size());
                    break;
                case "empty" :
                    print(queue.isEmpty());
                    break;
                case "front" :
                    print(queue.front());
                    break;
                case "back" :
                    print(queue.back());
                    break;
            }
        }
        br.close();
        bw.close();
    }
    
    private static void print(Integer data) throws Exception {
        bw.write(data + "");
        bw.newLine();
    }
    
    static class Queue {
        
        private int MAX = 2_000_001;
        private int[] data = new int[MAX];
        private int head = 0;
        private int tail = 0;
        
        
        public void push(Integer data) {
            this.data[tail++] = data;
        }
        
        public Integer pop() {
            if (head >= tail) {
                return -1;
            }
            return this.data[head++];
        }
        
        public Integer front() {
            if (head >= tail) {
                return -1;
            }
            return this.data[head];
        }
        
        public Integer back() {
            if (head >= tail) {
                return -1;
            }
            return this.data[tail - 1];
        }
        
        public Integer size() {
            return tail - head;
        }
        
        public Integer isEmpty() {
            return head >= tail ? 1 : 0;
        }
        
    }
}
