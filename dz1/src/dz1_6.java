import java.util.Arrays;
import java.util.Random;

public class dz1_6 {
    public dz1_6() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[0];
        arr = new int[10];
        int a = 0;
        int b = 101;

        int j;
        for (j = 0; j < arr.length; ++j) {
            arr[j] = a + rand.nextInt(b - a + 1);
            System.out.println(arr[j]);
        }

        System.out.println("=======================");
        Arrays.sort(arr);

        for (j = 0; j < arr.length; ++j) {
            System.out.println(arr[j]);
        }

    }
}
