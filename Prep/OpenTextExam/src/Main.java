public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(solution(new int[]{1,1,0,1}));
    }

//    public static int solution(int[] A) {
//        // Implement your solution here
//        int count1 = 0, count2=0;
//        for(int i=0;i<A.length;i++) {
////            if(i%2==0) {
////                if(A[i]==1) count1++;
////                else if (A[i]==0) count2++;
////            } else {
////                if(A[i]==0) count1++;
////                else if (A[i]==1) count2++;
////            }
//            if(A[i]==i%2) {
//                count1++;
//            } else {
//                count2++;
//            }
//        }
//        return Math.min(count1,count2);
//    }

    public static int solution(int[] A) {
        // Implement your solution here
        int count = 0;
        for(int i: A) {
            if(i==1) {
                count++;
            }
        }
        return Math.abs(A.length/2-count);
    }
}