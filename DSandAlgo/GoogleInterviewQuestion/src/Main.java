public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int[] returnSumNumbers(int[] intArray, int sum) {
        int[] indicesArray = new int[2];
        for(int i = 0; i<intArray.length;i++) {
            for(int j = i+1; j<intArray.length;j++) {
                if(intArray[i]+intArray[j] == sum) {
                    indicesArray[0] = intArray[i];
                    indicesArray[1] = intArray[j];
                }
            }
        }
        return indicesArray;
    }
    public static int[] returnSumNumbers1(int[] intArray, int sum) {
        int[] indicesArray = new int[2];
        for(int i = 0; i<intArray.length;i++) {
            int searchFor = sum - intArray[i];
        }
        return indicesArray;
    }
}