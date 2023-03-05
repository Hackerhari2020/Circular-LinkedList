class Node {
    int data;
    Node next;

    void display() {
        System.out.print(this.data + "\t");
    }
}

class CircularLinkedList {
    Node head;
    Node tail;

    public void insertAtFront(int value) {
        Node n1 = new Node();
        n1.data = value;
        if (head == null) {
            this.head = this.tail = n1;
            n1.next = head;
        }
        tail.next = n1;
        n1.next = head;
        head = n1;
    }

    public void insertAtEnd(int value) {
        Node n2 = new Node();
        n2.data = value;
        if (head == null) {
            this.head = this.tail = n2;
            n2.next = head;
        }
        n2.next = head;
        tail.next = n2;
        tail = n2;
    }

    public void insertAtPos(int value, int pos) {
        Node n3 = new Node();
        n3.data = value;

        Node temp = head;
        Node current = null;

        for (int i = 0; i < pos; i++) {
            current = temp;
            temp = temp.next;
        }

        current.next = n3;
        n3.next = temp;

    }

    public void display() {
        Node current = head;
        for (current = head.next; current != head; current = current.next) {
            current.display();
        }
    }
}

public class test4 {

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtFront(10);
        cl.insertAtFront(20);
        cl.insertAtFront(30);
        cl.insertAtFront(40);
        cl.insertAtFront(50);
        cl.insertAtFront(60);
        cl.insertAtEnd(100);
        cl.insertAtEnd(200);
        cl.insertAtEnd(300);
        cl.insertAtPos(444, 4);
        cl.insertAtPos(111, 1);
        cl.display();
    }

}
