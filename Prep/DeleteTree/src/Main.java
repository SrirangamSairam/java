public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        deleteTree(tree);
    }

    public static void deleteTree(TreeNode root) {
        TreeNode node = root;
        while (node.left.left != null) {
            node = node.left;
        }
        node.left = null;
        node.right = null;
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