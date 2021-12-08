public class main {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        abstract_queue<Integer> queue = new array_queue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
    }

    public static void test2() {
        abstract_queue<Integer> queue = new linked_queue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
    }
}