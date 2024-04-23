package queue;

public interface Queue<T> {
    void push(T data);
    T pop();
    T front();
    T back();
}
