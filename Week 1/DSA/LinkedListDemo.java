public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list =
                new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.display();

        list.delete(20);

        list.display();

        System.out.println(
                list.search(30)
        );
    }
}
