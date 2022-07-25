import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static final Scanner scanner = new Scanner(System.in);
    public static int readInteger() {
        //System.out.println("Enter number of elements");
        return scanner.nextInt();
    }
    public static int[] readElements(int size) {
        int[] elements = new int[size];
        /*for(int i=0; i<elements.length; i++) {
            elements[i] = scanner.nextInt();
        }  below statement also does the same*/
        Arrays.setAll(elements, i -> scanner.nextInt());
        return elements;
    }
    public static int findMin(int[] elements) {
        int min = Integer.MAX_VALUE;
        for (int element : elements) {
            min = Math.min(min, element);
        }
        return min;
    }
}
