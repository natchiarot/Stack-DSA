package Stacks;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Stack Arrays:");
        System.out.println();

        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(30);
        stackArrays.push(10);
        stackArrays.push(11);
        stackArrays.push(12);
        System.out.println(stackArrays);
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.deleteStack();
        System.out.println(stackArrays);
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
        stringStackArrays.push("sally");
        System.out.println(stringStackArrays);
        stringStackArrays.pop();
        stringStackArrays.peek();
        stringStackArrays.isEmpty();
        stringStackArrays.isFull();
        stringStackArrays.deleteStack();
        System.out.println(stringStackArrays);
        stringStackArrays.isEmpty();

        System.out.println();
        System.out.println();
        System.out.println("Stack Linked List:");
        System.out.println();

        StackLinkedList sLL = new StackLinkedList(5);
        sLL.push(5);
        sLL.push(2);
        sLL.push(3);
        sLL.push(4);
        sLL.push(8);
        sLL.push(9);
        System.out.println(sLL);
        sLL.pop();
        sLL.peek();
        sLL.isFull();
        sLL.isEmpty();
        sLL.deleteStack();
        System.out.println(sLL);
        sLL.peek();
        sLL.isEmpty();

        System.out.println();
        System.out.println();
        System.out.println("String Stack Linked List:");
        System.out.println();

        StringStackLinkedList stringSLL = new StringStackLinkedList(3);
        stringSLL.push("hello");
        stringSLL.push("racecar");
        stringSLL.push("world");
        stringSLL.push("hey");
        stringSLL.palindrome(0);
        stringSLL.palindrome(1);
        System.out.println(stringSLL);
        stringSLL.peek();
        stringSLL.pop();
        stringSLL.peek();
        stringSLL.isEmpty();
        stringSLL.deleteStack();
        System.out.println(stringSLL);
        stringSLL.isEmpty();
        stringSLL.pop();
        stringSLL.peek();
    }
}
