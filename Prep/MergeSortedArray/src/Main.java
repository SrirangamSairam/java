public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
        for(int i : nums1) {
            System.out.print(i+" ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] result = new int[m+n];
//        int i=0,j=0,k=0;
//        while(i<m && j<n) {
//            if(nums1[i]<nums2[j]) {
//                result[k++] = nums1[i++];
//            } else {
//                result[k++] = nums2[j++];
//            }
//        }
//        while (i<m) {
//            result[k++] = nums1[i++];
//        }
//        while (j<n) {
//            result[k++] = nums2[j++];
//        }
//        for(int i = 0;i< result.length;i++) {
//            nums1[i] = result[i];
//        }
//        return nums1;
        if ((m + n) == 0) return;
        if (n == 0) return;

        int i = m-1; // nums1 last non zero element
        int j = n-1; // nums2 last element
        int k = n+m-1; // result array last element (nums1)

        while (k > -1){

            if (i == -1) {nums1[k--] = nums2[j--]; continue;}
            if (j == -1) {nums1[k--] = nums1[i--]; continue;}

            if (nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
    }
}

//int[] mergerArray = new int[m+n];
//        int i=0,j=0,k=0;
//        while (i<m && j<n) {
//            if(nums1[i]<nums2[j]) {
//                mergerArray[k++]=nums1[i++];
//            } else {
//                mergerArray[k++]=nums2[j++];
//            }
//        }
//        while(i<m) {
//            mergerArray[k++]=nums1[i++];
//        }
//        while(j<n) {
//            mergerArray[k++]=nums2[j++];
//        }
//        nums1 = mergerArray;