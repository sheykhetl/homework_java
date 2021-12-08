public interface abstract_queue<E> {
    void add(E element);
    E poll();
    boolean isEmpty();
}