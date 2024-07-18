package Stacks;

// Implement a stack datastructure using LinkedList instead of Arrays.
public class StackLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public int setSize;
    int nodeValue;

    public StackLinkedList(int setSize) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = null;
        this.setSize = setSize;
    }

    public boolean isEmpty() {
        if (head == null) {
            System.out.println("Stack Linked List is empty.");
            return true;
        } else {
            System.out.println("Stack Linked List is not empty.");
        }
        return false;
    }

    public boolean isFull(){
        if (setSize == size){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    public void push(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        if (tail == null) {
            tail = node;
        }
        if(isFull()) {
            return;
        } else {
            // This adds the item to the top or head of the linked list.
            // This makes more sense because items will always be added to the head
            // so are technically the last in and will also be the first out.
            node.next = head;
            head = node;
            System.out.println(nodeValue + " successfully inserted");
        }
        size++;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Add value(s) to the stack first.");
            return;
        }
        Node tempNode = head;

        head = tempNode.next;
        if (head == null) {
            tail = null;
        }

        System.out.println("Value successfully removed.");

        size--;
    }

    public void peek(){
        if (head == null) {
            System.out.println("Stack Linked List does not exist");
        } else {
            System.out.println("Peek: " + head.value);
            }
    }

    public void deleteStack() {
        if (head == null) {
            System.out.println("Stack Linked List is already empty.");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                Node next = tempNode.next;
                tempNode.next = null;
                tempNode = next;
            }
            head = null;
            tail = null;
            System.out.println("Entire stack successfully deleted.");
        }
        size = 0;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "StringStackLinkedList {Empty Stack}";
        }
        return "StackLinkedList{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", set size=" + setSize +
                '}';
    }
}
