public class MyBST {
    private MyNode root;

    public void insert(int value) {
        MyNode newNode = new MyNode(value);
        if(this.root == null) {
            this.root = newNode;
            System.out.println("Successfully inserted " + value);
        } else {
            MyNode currNode = this.root;
            while (currNode != null) {
                if(currNode.getValue() > value && currNode.getLeft() != null) {
                    currNode = currNode.getLeft();
                } else if (currNode.getValue() > value && currNode.getLeft() == null) {
                    currNode.setLeft(newNode);
                    System.out.println("Successfully inserted " + value);
                    break;
                } else if (currNode.getValue() < value && currNode.getRight() != null) {
                    currNode = currNode.getRight();
                } else if (currNode.getValue() < value && currNode.getRight() == null){
                    currNode.setRight(newNode);
                    System.out.println("Successfully inserted " + value);
                    break;
                }
            }
        }
    }

    public void delete(int value) {
        MyNode newNode = new MyNode(value);
        MyNode currNode = this.root;
        MyNode prevNode = null;
        while(currNode.getValue() != newNode.getValue()) {
            if (currNode.getRight() == null && currNode.getLeft() == null) {
                break;
            }
            if(currNode.getValue() > value) {
                prevNode = currNode;
                currNode = currNode.getLeft();
            } else if (currNode.getValue() < value) {
                prevNode = currNode;
                currNode = currNode.getRight();
            }
        }
        if(currNode.getValue() == newNode.getValue()) {
            if (prevNode != null) {
                MyNode newCurrNode = findGreatestInCurrNodeLeft(currNode);
                if(newCurrNode == null) {
                    prevNode.setLeft(currNode.getRight());
                    System.out.println("Successfully Deleted 1 " + value);
                } else if (newCurrNode == currNode.getLeft()) {
                    prevNode.setLeft(newCurrNode);
                    newCurrNode.setRight(currNode.getRight());
                    System.out.println("Successfully Deleted 2 " + value);
                } else {
                    prevNode.setLeft(newCurrNode);
                    newCurrNode.setLeft(currNode.getLeft());
                    newCurrNode.setRight(currNode.getRight());
                    System.out.println("Successfully Deleted 3 " + value);
                }
            }
        }
    }

    private MyNode findGreatestInCurrNodeLeft(MyNode currNode) {
        MyNode prevNode = null;
        currNode = currNode.getLeft();
        if(currNode == null) {
            return null;
        }
        while (currNode.getRight() != null) {
            prevNode = currNode;
            currNode = currNode.getRight();
        }
        if (prevNode != null) {
            prevNode.setRight(null);
        }
        return currNode;
    }

    public void printTree() {
        MyNode currNode = this.root;
        printTreeInt(currNode);
    }

    private void printTreeInt(MyNode currNode) {
        if(currNode != null) {
            System.out.println(currNode.getValue());
            if(currNode.getLeft()!=null) {
                printTreeInt(currNode.getLeft());
            }
            if(currNode.getRight()!=null) {
                printTreeInt(currNode.getRight());
            }
        }
    }

}
