package queue.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2164 {
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int MAX = 1_000_001;
    private static final int[] data = new int[MAX];
    
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        int head = 0;
        int tail = 0;
        for (int i = 0; i < N; i++) {
            data[i] = i + 1;
        }
        tail = N;
        
        while (tail - head > 1) {
            if (head % 2 == 1) {
                data[tail] = data[head];
                tail++;
            }
            head++;
        }
        System.out.println(data[head]);
        br.close();
    }
    
}
