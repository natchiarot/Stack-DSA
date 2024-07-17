package Stacks;

public class StringStackLinkedList {

    public Node head;
    public Node tail;
    public int size;

    DoublyNode dHead;
    DoublyNode dTail;

    public Node createLinkedList(String nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.stringValue = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertDLL (String nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(dHead == null) {
            dHead = new DoublyNode();
            newNode = new DoublyNode();
            newNode.value = nodeValue;
            dHead = newNode;
            dTail = newNode;
            return;
        }
        newNode.next = null;
        dTail.next = newNode;
        newNode.prev = dTail;
        dTail = newNode;
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("Stack Linked List is empty.");
        } else {
            System.out.println("Stack Linked List is not empty.");
        }
    }

    public void push(String nodeValue){
        Node node = new Node();
        node.stringValue = nodeValue;
        if(head == null) {
            createLinkedList(nodeValue);
            return;
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
            System.out.println("Peek: " + head.stringValue);
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

    public boolean palindrome(int location) {
        if (location < 0 || location >= size) {
            return false;
        }

        Node currNode = head;
        for(int i = 0; i < location; i++) {
            currNode = currNode.next;
        }
        String nodeValue = currNode.stringValue;

        dHead = null;
        dTail = null;

        for (int i = 0; i < nodeValue.length(); i++) {
            insertDLL(Character.toString(nodeValue.charAt(i)));
        }

        DoublyNode left = dHead;
        DoublyNode right = dTail;

        while (left != null && right != null && left != right && left.next != right) {
            if(left.value.equalsIgnoreCase(right.value)) {
                System.out.println(nodeValue + " is a palindrome.");
                return true;
            }
            left = left.next;
            right = right.prev;
        }
        System.out.println(nodeValue + " is not a palindrome.");
        return false;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "StringStackLinkedList {Empty Stack}";
        }
        return "StringStackLinkedList{" +
                "head=" + head.stringValue +
                ", tail=" + tail.stringValue +
                ", size=" + size +
                '}';
    }
}
