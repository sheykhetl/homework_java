public class array_queue_ADT {

    private Object[] data;
    private int size, start, currentPosition;

    public array_queue_ADT() {
        clear();
    }

    public static void enqueue(array_queue_ADT queue, Object element) {
        if (queue.start == queue.currentPosition) {
            queue.start = mod(queue.start + 1, queue.data.length);
        }
        queue.data[queue.currentPosition] = element;
        queue.currentPosition = mod(queue.currentPosition + 1, queue.data.length);
        queue.size = Math.min(queue.size + 1, 16);
    }

    public static Object element(array_queue_ADT queue) {
        return queue.data[queue.start];
    }

    public static Object dequeue(array_queue_ADT queue) {
        if (queue.size == 0) {
            return null;
        }
        Object element = element(queue);
        queue.data[queue.start] = null;
        queue.start = mod(queue.start + 1, queue.data.length);
        queue.size -= 1;
        return element;
    }

    public static int size(array_queue_ADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(array_queue_ADT queue) {
        return queue.size == 0;
    }

    public void clear() {
        data = new Object[16];
        size = 0;
        start = 0;
        currentPosition = 0;
    }

    private static int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }
}