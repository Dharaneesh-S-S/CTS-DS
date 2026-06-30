public class LinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertAtBeginning(int data) {

        Node newNode =
                new Node(data);

        newNode.next = head;

        head = newNode;
    }

    public void insertAtEnd(int data) {

        Node newNode =
                new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void display() {

        Node temp = head;

        while(temp != null) {

            System.out.print(
                    temp.data + " -> "
            );

            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public boolean search(int key) {

        Node temp = head;

        while(temp != null) {

            if(temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public void delete(int key) {

        if(head == null)
            return;

        if(head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null &&
                temp.next.data != key) {

            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next =
                    temp.next.next;
        }
    }

}