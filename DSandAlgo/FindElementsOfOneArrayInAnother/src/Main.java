public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findCommon(new int[]{}, new int[]{}));
        System.out.println(findCommon(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(findCommon(new int[]{1,2,3}, new int[]{1,2,3,4,5,6}));
    }
    // Given two arrays, create a function that lets user know whether the two arrays have any common elements.
    public static boolean findCommon(int[] array1, int[] array2) {
        for(int i: array1) {
            for(int j: array2) {
                if(i==j)
                    return true;
            }
        }
        return false;
    }
}
