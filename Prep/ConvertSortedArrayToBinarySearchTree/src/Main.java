public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }
//    public static TreeNode sortedArrayToBST(int[] nums) {
//        int middle = nums.length/2;
//        TreeNode root = new TreeNode(nums[middle]);
//        TreeNode currNode = root;
//        for(int i=middle-1;i>=0;i--) {
//            currNode.left = new TreeNode(nums[i]);
//            currNode = currNode.left;
//        }
//        currNode = root;
//        for(int j=middle+1;j< nums.length;j++) {
//            currNode.right = new TreeNode(nums[j]);
//            currNode = currNode.right;
//        }
//        return root;
//    }

    public static TreeNode sortedArrayToBST(int[] nums) { //recursive
        return CreateBST(nums, 0, nums.length-1);
    }
    public static TreeNode CreateBST(int[] nums, int start, int end) {
        if(start>end) return null;
        int middle = (start+end)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = CreateBST(nums,start,middle-1);
        root.right = CreateBST(nums,middle,end);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}