import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode1.right = treeNode5;
        treeNode5.left = treeNode7;
        treeNode5.right = treeNode6;
        System.out.println(isSymmetric(treeNode1));
    }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        while (leftTree!=null&&rightTree!=null || !stack1.empty() && !stack2.empty()) {
            if(leftTree!=null&&rightTree!=null) {
                if (leftTree.val == rightTree.val) {
                    stack1.add(leftTree);
                    stack2.add(rightTree);
                    leftTree = leftTree.left;
                    rightTree = rightTree.right;
                }
            }
        }
        if(leftTree==null&&rightTree!=null) return false;
        if(leftTree!=null) return false;
        TreeNode treeNode1 = stack1.pop();
        TreeNode treeNode2 = stack2.pop();
        if(treeNode1.right != null && treeNode2.left != null) {
            treeNode1 = treeNode1.right;
            treeNode2 = treeNode2.left;
            return treeNode1.val == treeNode2.val;
        }
        return true;
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