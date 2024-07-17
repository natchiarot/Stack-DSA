package Stacks;

public class StackLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("Stack Linked List is empty.");
        } else {
            System.out.println("Stack Linked List is not empty.");
        }
    }

    public void push(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createLinkedList(nodeValue);
            return;
            // This adds the item to the top or head of the linked list.
            // This makes more sense because items will always be added to the head
            // so are technically the last in and will also be the first out.
        } else {
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
}
