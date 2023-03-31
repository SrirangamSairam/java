import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if(p == null && q!= null) return false;
        if(p != null && q== null) return false;
        while ((p!=null || q!=null) || (!stack1.empty() && !stack2.empty())) {
            while ((p!=null && q!=null)) {
                if (p.val == q.val) {
                    stack1.add(p);
                    p = p.left;
                    stack2.add(q);
                    q = q.left;
                } else
                    return false;
            }
            if(p!=null || q!=null) return false;
            p = stack1.pop();
            p = p.right;
            q = stack2.pop();
            q = q.right;
        }
        return stack1.empty() && stack2.empty();
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