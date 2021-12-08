public interface queue<E> {
    void enqueue(E element);
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}