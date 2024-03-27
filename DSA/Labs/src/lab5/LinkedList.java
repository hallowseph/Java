package lab5;

/**
 *
 * @author xxg8089
 */
public class LinkedList {

    Node head, tail;
    boolean isDoublyLinkedList = false;
    int size = 0;

    public LinkedList(String[] dataList) {
        Node node = new Node();
        head = node;
        Node current = head;
        node.data = dataList[0];

        for (int i = 1; i < dataList.length; i++) {
            node = new Node();
            node.data = dataList[i];
            node.next = null;
            node.prev = null;
            current.next = node;
            current = current.next;
            size++;
        }
        tail = current;
    }

    public void printList(boolean reversely) {
        if (reversely) {
            printListReversely(head);
        } else {
            printList(head);
        }
    }

    private void printList(Node current) {
        System.out.println(current.data);
        if (current.next != null) {
            printList(current.next);
        }
    }

    private void printListReversely(Node current) {
        if (current.next != null) {
            printListReversely(current.next);
        }
        System.out.println(current.data);
    }

    public void printListByLinker() {
        for (Node current = head; current != null; current = current.next) {
            System.out.println(current.data);
        }

        for (Node current = tail; current != null; current = current.prev) {
            System.out.println(current.data);
        }
    }

    public void toDoublyLinkedList() {
        toDoublyLinkedList(head);
        isDoublyLinkedList = true;
    }

    public void toCircularlyLinkedList() {

    }

    private Node toDoublyLinkedList(Node current) {
        if (current == null) {
            return null;
        }

        Node previousNode = toDoublyLinkedList(current.next);

        if (previousNode != null) {
            previousNode.prev = current;
        }

        current.next = previousNode;
        return current;
    }
}
