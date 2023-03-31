public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(maxDepth(treeNode1));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
//        if(root.left == null && root.right == null) {
//            return 1;
//        }

        return Integer.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
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