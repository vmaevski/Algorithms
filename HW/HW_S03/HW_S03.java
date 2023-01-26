// разворот двухсвязного списка
public class HW_S03 {

    Node head;
    Node tail;

    public void revert() { 
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.previous = next;
            currentNode.next = previous;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }
    public class Node {

        int value;
        Node next;
        Node previous;
    }
}