public class LinkedList {

        public class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head;
        public LinkedList() {
            head = null;
        }
        // inserting at the beginning
        public void insert(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            System.out.println("Inserted " + data + "at the beginning");
        }
        // inserting at the end
        public void insertAtEnd(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;

            }
            System.out.println("Inserted " + data + " at the end" );
        }
        // deleting from the beginning
        public void delete(int data) {
            if (head == null) {
                System.out.println("list is empty, nothing to delete");
            }else  {
                System.out.println("deleting " + data + " at the beginning");
                head = head.next;
            }
        }
        // display method
        public void display() {
            if (head == null) {
                System.out.println("list is empty");
            } else {
                Node current = head;
                System.out.println("list is : ");
                while (current != null) {
                    System.out.println(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // inserting at the beginning
            list.insert(3);
            list.insert(2);
            list.insert(1);
            list.display();

            // inserting at the end
            list.insertAtEnd(4);
            list.insertAtEnd(5);
            list.display();

            // deleting from the beginning
            list.delete(1);
            list.delete(2);
            list.delete(3);
            list.delete(4);
            list.delete(5);
            list.display();

        }
}
