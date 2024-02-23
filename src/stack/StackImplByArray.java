package stack;

import java.util.EmptyStackException;

public class StackImplByArray implements Stack<Integer> {
    
    private static final int MX = 1000005;
    private Integer[] data = new Integer[MX];
    private int pos = 0;
    
    @Override
    public Integer pop() {
        if (pos == 0) {
            throw new EmptyStackException();
        }
        pos--;
        return data[pos];
    }
    
    @Override
    public void push(Integer input) {
        data[pos] = input;
        pos++;
    }
    
    @Override
    public Integer top() {
        if (pos == 0) {
            throw new EmptyStackException();
        }
        return data[pos - 1];
    }
}
