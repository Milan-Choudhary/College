
//Filling the functions for practice

package Java;


// File: linkedlist_implementation.java

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist_implementation {
    Node head;

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        // TODO: implement
        if(head == null){
            head = new Node(data);
            return;
        }

        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        // TODO: implement
        if(head == null){
            head = new Node(data);
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node res = new Node(data);
        temp.next = res;

        
    }

    // Insert a node at a specific position (1-based index)
    public void insertAtPosition(int data, int position) {
        // TODO: implement
    }

    // Delete a node by value
    public void deleteByValue(int data) {
        // TODO: implement
    }

    // Delete a node at a specific position (1-based index)
    public void deleteAtPosition(int position) {
        // TODO: implement
    }

    // Search for a value in the linked list
    public boolean search(int key) {
        // TODO: implement
        return false;
    }

    // Count the number of nodes in the linked list
    public int countNodes() {
        // TODO: implement
        return 0;
    }

    // Reverse the linked list
    public void reverse() {
        // TODO: implement
    }

    // Print the linked list
    public void printList() {
        // TODO: implement
    }

    // Main method to test the functions
    public static void main(String[] args) {
        linkedlist_implementation list = new linkedlist_implementation();

        // Example test cases for you to expand
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(15, 2);

        list.printList();  // Expected: 10 -> 15 -> 20 -> 30

        list.deleteByValue(20);
        list.printList();  // Expected: 10 -> 15 -> 30

        list.reverse();
        list.printList();  // Expected: 30 -> 15 -> 10

        System.out.println("Count: " + list.countNodes());
        System.out.println("Search 15: " + list.search(15));
    }
}

