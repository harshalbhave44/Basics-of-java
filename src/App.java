public class App {
    public static void main(String[] args) throws Exception {
        Tree t = new Tree();
        t.insert(1);
        // t.inorder(t.head);
        t.insert(2);
        // t.inorder(t.head);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.inorder(t.head);
    }
}
