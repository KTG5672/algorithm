package deque;

public interface Deque<T> {
    
    void push_front(T data);
    void push_back(T data);
    T pop_front();
    T pop_back();
    T front();
    T back();
    boolean isEmpty();
    
}
