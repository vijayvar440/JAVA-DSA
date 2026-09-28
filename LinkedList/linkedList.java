public class linkedList {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail
    public static Node head;
    public static Node tail;

    // Add First
    public void addFirst(int data) {

        // Create new node
        Node newNode = new Node(data);

        // If Linked List is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // New node points to current head
        newNode.next = head;

        // New node becomes head
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {

        // Create new node
        Node newNode = new Node(data);

        // If Linked List is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Current tail points to new node
        tail.next = newNode;

        // New node becomes tail
        tail = newNode;
    }

    // Print Linked List
    public void print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {

        linkedList ll = new linkedList();

        ll.print();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.print();
    }
}