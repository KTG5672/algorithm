package deque;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class DequeImplByArray implements Deque<Integer> {
    
    private int MAX = 1_000_005;
    private int[] datas = new int[2 * MAX + 1];
    private int head = MAX;
    private int tail = MAX;
    
    @Override
    public void push_front(Integer data) {
        datas[--head] = data;
    }
    
    @Override
    public void push_back(Integer data) {
        datas[tail++] = data;
    }
    
    @Override
    public Integer pop_front() {
        if (head >= tail) {
            throw new NoSuchElementException();
        }
        return datas[head++];
    }
    
    @Override
    public Integer pop_back() {
        if (head >= tail) {
            throw new NoSuchElementException();
        }
        return datas[--tail];
    }
    
    @Override
    public Integer front() {
        return datas[head];
    }
    
    @Override
    public Integer back() {
        return datas[tail - 1];
    }
    
    @Override
    public boolean isEmpty() {
        return tail - head == 0;
    }
    
    public static void main(String[] args) {
        Deque deque = new DequeImplByArray();
        deque.push_front(1);
        deque.push_front(2);
        deque.push_front(3);
        deque.push_back(1);
        deque.push_back(2);
        deque.push_back(3);
        
        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);
        
        while (!deque.isEmpty()) {
            System.out.println(deque.pop_front());
            System.out.println("arrayDeque.pollFirst() = " + arrayDeque.pollFirst());
        }
        
    }

}
