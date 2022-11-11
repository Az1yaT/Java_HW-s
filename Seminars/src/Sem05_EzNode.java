public class Sem05_EzNode {
    public static void main(String[] args) {
    /* Построим следующее дерево       
            1
          /   \
         2     3
        /    /   \
       4    5     6
     /   \       / \
    7     9    11   20
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(9);
        root.right.right.left = new Node(11);
        root.right.right.right = new Node(20);
        System.out.println("Сумма дерева: " + root.sum());
    }
}
class Node {
    int value;
    Node left, right;

    public Node(int value, Node left, Node right){
        this.value = value;
        this.right = right;
        this.left = left;
    }
    public Node(int value){
        this.value = value;
    }

    public int sum(){
        int summ = value;

        if (left != null) summ += left.sum();

        if (right != null) summ += right.sum();

        return summ;
    }
}