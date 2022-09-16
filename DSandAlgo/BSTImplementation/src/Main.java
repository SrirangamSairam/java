public class Main {
    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.insert(10);
        myBST.printTree();
        myBST.insert(20);
        myBST.printTree();
        myBST.insert(5);
        myBST.printTree();
        myBST.insert(3);
        myBST.printTree();
        myBST.insert(2);
        myBST.printTree();
        myBST.insert(8);
        myBST.printTree();
        myBST.insert(7);
        myBST.printTree();
        myBST.insert(9);
        myBST.printTree();
        myBST.insert(6);
        myBST.printTree();
        myBST.insert(4);
        myBST.printTree();
        myBST.delete(5);
        myBST.printTree();
        System.out.println("Hello world!");
    }
}