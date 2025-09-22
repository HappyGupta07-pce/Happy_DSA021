import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class SingleLL {
    Node head = null;

    void insertAtBeg(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            newNode.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtEnd(int d) {
        Node newNode = new Node(d);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertAtPos(int d, int pos) {
        Node newNode = new Node(d);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteAtBeg() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        } else {
            head = head.next;
        }
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i <= pos - 2 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        SingleLL obj = new SingleLL();
        obj.insertAtBeg(10);
        obj.insertAtBeg(20);
        obj.insertAtBeg(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(65);
        obj.insertAtPos(70, 5);
        obj.insertAtBeg(5);
        obj.deleteAtEnd();
        obj.display();
        obj.deleteAtEnd();
        obj.deleteAtBeg();
        obj.display();
    }
}