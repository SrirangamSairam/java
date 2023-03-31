public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int[] result = sortedArray(new int[]{5,8,9,11,12}, new int[]{4,7,8,10});
//        for(int i: result) {
//            System.out.println(i);
//        }
        System.out.println(countWays(5,4));
    }

    public static int[] sortedArray(int [] arr1, int [] arr2) {
        int[] result = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length&&j< arr2.length) {
            if(arr1[i]<arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i< arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j< arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }


//Input  : arr1[] = { 5, 8, 9}
//         arr2[] = {4, 7, 8}
//Output : arr3[] = {4, 5, 7, 8, 8, 9}





//[1,1]
//[1,1]
//[1,1]  //3
//
//
//
//
//
//        [1,1,1]
//        [1,1,1]
//        [1,1,1]
//        [1,1,1] //7  //10

//    [1,1]
//    [1,1]

public static int countWays(int width, int height) {
        int count = 0;
        if(width==1||height==1) return 1;
        if(height>0) {
            count += countWays(width,height-1);
        }
        if(width>0) {
            count += countWays(width-1, height);
        }
        return count;
}
}
