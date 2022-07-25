import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numsArray = getIntegers(5);
        int[] sortedArray = sortIntegers(numsArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int size) {
        int[] numsArray = new int[size];
        for(int i=0;i<size;i++) {
            numsArray[i] = scanner.nextInt();
        }
        scanner.close();
        return numsArray;
    }

    public static int[] sortIntegers(int[] numsArray) {
        for(int i=0;i<numsArray.length;i++) {
            for(int j=i+1;j<numsArray.length;j++) {
                if(numsArray[j]>numsArray[i]) {
                    numsArray[j] = numsArray[j]+numsArray[i];
                    numsArray[i] = numsArray[j]-numsArray[i];
                    numsArray[j] = numsArray[j]-numsArray[i];
                }
            }
        }
        return numsArray;
    }

    public static void printArray(int[] sortedArray) {
        for(int i=0;i<sortedArray.length;i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }
}