public class dz1_3 {
        public dz1_3() {
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            int counter = 0;

            for (int i = 0; i < arr.length; ++i) {
                counter += arr[i];
            }

            System.out.println(counter);
        }
}
