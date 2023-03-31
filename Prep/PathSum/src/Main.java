import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = node7;
        node4.right = node8;
        node3.left = node5;
        node3.right = node6;
        node6.right = node9;
        System.out.println(hasPathSum(node1,22));
    }

//    public static boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root == null) return false;
//        if(root.left == null && root.right == null && root.val == targetSum) return true;
//        return hasPathSum(root.left, targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
//    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> valStack = new Stack<>();
        stack.add(root);
        valStack.add(root.val);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int tempVal = valStack.pop();
            if(node.left==null && node.right==null) {
                if(tempVal == targetSum) return true;
            }
            else {
                if(node.left != null) {
                    stack.add(node.left);
                    valStack.add(node.left.val+tempVal);
                }
                if(node.right != null) {
                    stack.add(node.right);
                    valStack.add(node.right.val+tempVal);
                }
            }
        }
        return false;
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