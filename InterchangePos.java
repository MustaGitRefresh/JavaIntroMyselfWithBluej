import java.util.Arrays;
import java.util.Scanner;
public class InterchangePos {
    public static void main(String[] args) {
        // Creating array
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        size = sc.nextInt();
        int a[][] = new int[size][size];
        int b[] = new int[size];
        // Defining some variables
        int counter = 0;
        // Creating Scanner instance
        // Taking input the array
        for (int k = 0; k < size; k++) {
            System.out.println("Enter the " + (k + 1) + "array");
            for (int p = 0; p < size; p++) {
                counter++;
                b[p] = counter;
            }
            a[k] = b;
            Arrays.fill(b, 0);
        }
        System.out.println(Arrays.toString(b));
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
