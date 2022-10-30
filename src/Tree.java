public class Tree {

    class Node {
        int data;
        Node left, right;

        Node(int input) {
            data = input;
            left = null;
            right = null;
        }
    }

    Node head;

    void insert(int input) {
        Node n = new Node(input);
        if (head == null) {
            head = n;
            return;
        }
        System.out.println("Inserted");
        Node pointer = head;
        Node parent = null;
        while (pointer != null) {
            parent = pointer;
            if (input > pointer.data) {
                pointer = pointer.right;
            } else {
                pointer = pointer.left;
            }
        }
        if (parent.data < input) {
            parent.right = n;
        } else {
            parent.left = n;
        }
    }

    void inorder(Node pointer) {
        if (pointer == null) {
            return;
        }
        inorder(pointer.left);
        System.out.println(pointer.data);
        inorder(pointer.right);
    }

}