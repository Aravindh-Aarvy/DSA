public class insert_at_the_end_linkedList {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        // Creating the linked list with data 1
        Node head = new Node(1);

        // Inserting nodes at the end
        head = insert_at_the_end(head, 2);
        head = insert_at_the_end(head, 3);
        head = insert_at_the_end(head, 4);

        // Print the linked list
        print_Linked_list(head);
    }

    // Method to print the linked list
    public static void print_Linked_list(Node node) {
        Node head = node;

        while (head != null) {  // Traverse until you reach the end of the list
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Method to insert a node at the end of the linked list
    static Node insert_at_the_end(Node node, int data) {
        if (node == null) {  // If the list is empty, create the first node
            return new Node(data);
        }

        // Traverse to the end of the list
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert the new node at the end
        temp.next = new Node(data);

        return node;  // Return the original head of the list
    }
}

class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    Node(int x) {
        this.data = x;
        this.next = null;
    }

    // Default constructor
    Node() {}
}
