public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(maxProduct(new int[]{-2,3,-4,5,4,-10}));
        System.out.println(maxProduct(new int[]{-2,3,-4,5,4}));
    }

    public static int maxProduct(int[] arr) {
        int product = arr[0];
        int maxProduct = arr[0];
        int minProduct = arr[0];
        for(int i=1;i<arr.length;i++) {
            maxProduct *= arr[i];//-6,-12,120,480,-4800
            minProduct *= arr[i];//-6,24,-60,-240,2400
            int temp = Integer.max(Integer.max(arr[i], maxProduct), minProduct);//3,24,120,480,2400
            minProduct = Integer.min(Integer.min(arr[i], maxProduct), minProduct);//-6,-12,-60,-240,,-480
            maxProduct = temp;//3,24,120,480,2400
            product = Integer.max(product,maxProduct);//3,24,120,480,2400
        }
        return product;
    }
}



//Given an integer array nums, find a
//subarray
//that has the largest product, and return the product.
//Input: nums = [2,3,-2,4,5]
//Output: 6 20
//Explanation: [2,3] has the largest product 6.