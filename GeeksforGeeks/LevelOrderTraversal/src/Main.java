import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    static ArrayList<Integer> levelOrder(Node node)
    {
        // Your code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node currNode = node;
        while (currNode!=null) {
            if((currNode.left != null)) queue.add(currNode.left);
            if((currNode.right != null)) queue.add(currNode.right);
            arrayList.add(queue.poll().data);
            currNode = queue.peek();
        }
        return arrayList;
    }
}
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

