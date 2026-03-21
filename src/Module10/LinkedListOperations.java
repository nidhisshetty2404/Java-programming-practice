package Module10;

// Node class (only ONE definition)
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    Node head;

    // 1️⃣ Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // 2️⃣ Insert at Beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3️⃣ Insert at End
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 4️⃣ Delete by Value
    void delete(int key) {
        if (head == null) return;

        // delete head
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value not found");
        }
    }

    // 5️⃣ Count Nodes
    int countNodes() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // MAIN METHOD (Program execution starts here)
    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();

        // Insert elements
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Display list
        System.out.println("Linked List:");
        list.display();

        // Delete element
        System.out.println("After deleting 20:");
        list.delete(20);
        list.display();

        // Count nodes
        System.out.println("Number of nodes: " + list.countNodes());
    }
}
