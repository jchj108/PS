package base;

class Node {
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public static Node of(int value, Node leftChild, Node rightChild) {
        return new Node(value, leftChild, rightChild);
    }

}

public class BinarySearchTree {

    public static void main(String[] args) {

    }
}
