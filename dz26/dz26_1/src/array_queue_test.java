public class array_queue_test {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        queue<Integer> queue = new array_queue<>();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 16; i++) {
            queue.dequeue();
        }
        System.out.println(queue.isEmpty());
    }

    private static void test2() {
        array_queue_ADT queue = new array_queue_ADT();
        for (int i = 0; i < 20; i++) {
            array_queue_ADT.enqueue(queue, i);
        }
        System.out.println(array_queue_ADT.isEmpty(queue));
        for (int i = 0; i < 16; i++) {
            array_queue_ADT.dequeue(queue);
        }
        System.out.println(array_queue_ADT.isEmpty(queue));
    }

    private static void test3() {
        for (int i = 0; i < 20; i++) {
            array_queue_module.enqueue(i);
        }
        System.out.println(array_queue_module.isEmpty());
        for (int i = 0; i < 16; i++) {
            array_queue_module.dequeue();
        }
        System.out.println(array_queue_module.isEmpty());
    }
}