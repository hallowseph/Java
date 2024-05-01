package week8;

/**
 *
 * @author xxg8089
 */
public class Week8 {
    public static void main(String[] args) {
        String[] elements = "cow, fly, dog, bat, fox, cat, eel, ant".split(", ");
        StringBinaryTree bTree = new StringBinaryTree(elements);
        bTree.traverse();
        
        System.out.println();
        bTree.linkParent();
        bTree.traverse();
    }
}
