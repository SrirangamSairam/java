public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 30;
        test(a);
        System.out.println(a + " " + b);
        int[] arr1 = {10,20,40};
        int[] arr2 = arr1;
        arr1[2] = 30;
        arr2[2] = 50;
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);
        testArr(arr1);
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);
    }
    public static void test(int a){
        a = 50;
    }
    public static void testArr(int[] arr1) {
        arr1[1] = 100; // this change also affects the parameter that wss passed because the reference is not changed
        arr1 = new int[] {1,2,3,4,5}; // since new keyword is used, new reference got created and new reference points to array {1,2,3,4,5}
        arr1[1] = 300; // this change doesn't affect the parameter that was passed as the reference got changed
        // new keyword dereference the object and refers it to another object
    }
}