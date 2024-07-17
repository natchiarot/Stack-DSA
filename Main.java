package Stacks;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Stack Arrays:");
        System.out.println();
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(30);
        stackArrays.push(10);
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.deleteStack();
        stackArrays.isEmpty();

        System.out.println();
        System.out.println();
        System.out.println("String Stack Arrays:");
        System.out.println();

        StringStackArrays stringStackArrays = new StringStackArrays(5);
        stringStackArrays.push("racecar");
        stringStackArrays.push("apple");
        stringStackArrays.palindrome(0);
        stringStackArrays.palindrome(1);
        stringStackArrays.push("orange");
        stringStackArrays.push("banana");
        stringStackArrays.push("kelp");
        stringStackArrays.pop();
        stringStackArrays.peek();
        stringStackArrays.isEmpty();
        stringStackArrays.isFull();
        stringStackArrays.deleteStack();
        stringStackArrays.isEmpty();

        System.out.println();
        System.out.println();
        System.out.println("Stack Linked List:");
        System.out.println();

        StackLinkedList sLL = new StackLinkedList();
        sLL.push(1);
        sLL.push(2);
        sLL.push(3);
        sLL.push(4);
        sLL.pop();
        sLL.peek();
        sLL.isEmpty();
        sLL.deleteStack();
        sLL.peek();
        sLL.isEmpty();

        System.out.println();
        System.out.println();
        System.out.println("String Stack Linked List:");
        System.out.println();

        StringStackLinkedList stringSLL = new StringStackLinkedList();
        stringSLL.push("hello");
        stringSLL.push("racecar");
        stringSLL.push("world");
        stringSLL.palindrome(0);
        stringSLL.palindrome(1);
        stringSLL.peek();
        stringSLL.pop();
        stringSLL.peek();
        stringSLL.isEmpty();
        stringSLL.deleteStack();
        stringSLL.isEmpty();
        stringSLL.pop();
        stringSLL.peek();
    }
}
