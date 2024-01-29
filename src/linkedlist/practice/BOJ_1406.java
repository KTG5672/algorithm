package linkedlist.practice;


import java.io.*;
import java.util.Arrays;

public class BOJ_1406 {
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    
    public static void main(String[] args) throws IOException {
        String L = br.readLine();
        int M = Integer.parseInt(br.readLine());
        LinkedList editor = new LinkedList(L);
        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");
            if ("L".equals(command[0])) {
                editor.shiftLeft();
            } else if ("D".equals(command[0])) {
                editor.shiftRight();
            } else if ("B".equals(command[0])) {
                editor.erase();
            } else if ("P".equals(command[0])) {
                char ch = command[1].charAt(0);
                editor.insert(ch);
            }
        }
        editor.traverse();
        br.close();
        bw.close();
    }
    
    static class LinkedList {
        private char[] chars = new char[600_001];
        
        private int[] pre = new int[600_001];
        
        private int[] next = new int[600_001];
        
        private int unused = 1;
        private int cursor = 0;
        
        LinkedList(String str) {
            Arrays.fill(pre, -1);
            Arrays.fill(next, -1);
            
            int length = str.length();
            for (int i = 0; i < length; i++) {
                insert(str.charAt(i));
            }
            
        }
        
        void insert(char input) {
            
            chars[unused] = input;
            pre[unused] = cursor;
            next[unused] = next[cursor];
            
            if (next[cursor] != -1) {
                pre[next[cursor]] = unused;
            }
            next[cursor] = unused;
            unused++;
            
            shiftRight();
        }
        
        void erase() {
            
            if (cursor == 0) {
                return;
            }
            
            if (next[cursor] != -1) {
                pre[next[cursor]] = pre[cursor];
            }
            next[pre[cursor]] = next[cursor];
            
            shiftLeft();
        }
        
        void shiftLeft() {
            if (pre[cursor] != -1) {
                cursor = pre[cursor];
            }
        }
        
        void shiftRight() {
            if (next[cursor] != -1) {
                cursor = next[cursor];
            }
        }
        
        public void traverse() throws IOException {
            int cur = next[0];
            while (cur != -1) {
                bw.write(chars[cur]);
                cur = next[cur];
            }
        }
        
    }
}
