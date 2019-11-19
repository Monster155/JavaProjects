import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of array");
        int quan = sc.nextInt();
        int[] array = new int[quan];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        insertion(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void insertion(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                array[j] += array[j - 1];
                array[j - 1] = array[j] - array[j - 1];
                array[j] -= array[j - 1];
                j--;
            }
        }
    }
}
