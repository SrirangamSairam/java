public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i: plusOne(new int[]{9,3,9})) {
            System.out.println(i);
        }
    }

//    public static int[] plusOne(int[] digits) {
//        boolean flag = false;
//        for(int i=digits.length-1;i>=0;i--) {
//            if(digits[i]==9) {
//                digits[i] = 0;
//            } else {
//                digits[i] += 1;
//                flag = true;
//                break;
//            }
//        }
//        if(!flag) {
//            int[] result = new int[digits.length+1];
//            result[0] = 1;
//            return result;
//        }
//        return digits;
//    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i]==9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }
}