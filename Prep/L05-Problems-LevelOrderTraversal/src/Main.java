import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Node1 node = new Node1(10);
        Node1 node1 = new Node1(20);
        Node1 node2 = new Node1(30);
        Node1 node3 = new Node1(40);
        Node1 node4 = new Node1(60);
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        for(Integer integer : levelOrder(node)) {
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> levelOrder(Node1 node) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node1> queue = new LinkedList<>();
        if(node!=null) queue.add(node);
        while (queue.size()>0) {
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            list.add(queue.poll().data);
            node = queue.peek();
        }
        return list;
    }
}

class Node1
{
    int data;
    Node1 left, right;

    Node1(int item)
    {
        data = item;
        left = right = null;
    }
}