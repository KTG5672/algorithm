package linkedlist.practice;

import java.io.*;
import java.util.Arrays;

public class BOJ_5397 {
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws Exception {
        
        int count = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            KeyLogger keyLogger = new KeyLogger(str);
            keyLogger.traverse();
        }
        bw.close();
        br.close();
    }
    
    static class KeyLogger {
        
        private int MX = 1_000_001;
        private char[] data = new char[MX];
        private int[] pre = new int[MX];
        private int[] next = new int[MX];
        private int unused = 1;
        private int cursor = 0;
        
        public KeyLogger(String str) {
            Arrays.fill(pre, -1);
            Arrays.fill(next, -1);
            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                switch (ch) {
                    case '<':
                        shiftLeft();
                        break;
                    case '>':
                        shiftRight();
                        break;
                    case '-':
                        remove();
                        break;
                    default:
                        insert(ch);
                        break;
                }
            }
        }
        
        
        
        public void shiftRight() {
            if (next[cursor] == -1) {
                return;
            }
            cursor = next[cursor];
        }
        public void shiftLeft() {
            if (pre[cursor] == -1) {
                return;
            }
            cursor = pre[cursor];
        }
        
        public void insert(char ch) {
            data[unused] = ch;
            next[unused] = next[cursor];
            pre[unused] = cursor;
            
            if (next[cursor] != -1) {
                pre[next[cursor]] = unused;
            }
            next[cursor] = unused;
            unused++;
            
            shiftRight();
        }
        
        public void remove() {
            if (cursor == 0) {
                return;
            }
            
            next[pre[cursor]] = next[cursor];
            
            if (next[cursor] != -1) {
                pre[next[cursor]] = pre[cursor];
            }
            shiftLeft();
        }
        
        public void traverse() throws IOException {
            int cur = next[0];
            while (cur != -1) {
                bw.write(data[cur]);
                cur = next[cur];
            }
            bw.newLine();
        }
        
        
    }
    
}
