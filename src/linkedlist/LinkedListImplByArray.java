package linkedList;

import java.util.Arrays;

public class LinkedListImplByArray implements LinkedList {
    
    private int unused = 1;
    private final int maxSize = 9999;
    private int[] arr = new int[maxSize];
    private int[] pre = new int[maxSize];
    private int[] next = new int[maxSize];
    
    public LinkedListImplByArray() {
        Arrays.fill(pre, -1);
        Arrays.fill(next, -1);
    }
    
    @Override
    public void traverse() {
        int cur = next[0];
        while (cur != -1) {
            System.out.print(arr[cur] + " ");
            cur = next[cur];
        }
    }
    
    @Override
    public void insert(int addr, int num) {
        arr[unused] = num;
        pre[unused] = addr;
        next[unused] = next[addr];
        
        if (next[addr] != -1) {
            pre[next[addr]] = unused;
        }
        next[addr] = unused;
        unused++;
    }
    
    @Override
    public void erase(int addr) {
        if (addr == 0) {
            return;
        }
        next[pre[addr]] = next[addr];
        
        if (next[addr] != -1) {
            pre[next[addr]] = pre[addr];
        }
    }
}
