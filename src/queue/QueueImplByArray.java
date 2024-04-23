package queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class QueueImplByArray implements Queue<Integer> {
    
    private int MAX = 1_000_005;
    private int[] data = new int[MAX];
    private int head = 0;
    private int tail = 0;
    
    
    @Override
    public void push(Integer data) {
        this.data[tail++] = data;
    }
    
    @Override
    public Integer pop() {
        if (head >= tail) {
            throw new NoSuchElementException();
        }
        return this.data[head++];
    }
    
    @Override
    public Integer front() {
        return this.data[head];
    }
    
    @Override
    public Integer back() {
        return this.data[tail - 1];
    }
}
