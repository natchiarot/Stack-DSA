package Stacks;

public class Main {
    public static void main(String[] args) {
//        StackArrays stackArrays = new StackArrays(5);
//        stackArrays.push(1);
//        stackArrays.push(2);
//        stackArrays.push(30);
//        stackArrays.push(10);
//        System.out.println(stackArrays);
//        stackArrays.pop();
//        System.out.println(stackArrays);
//        stackArrays.peek();
//        stackArrays.isEmpty();
//        stackArrays.isFull();
//        stackArrays.deleteStack();
//        System.out.println(stackArrays);
//        stackArrays.isEmpty();

//        StringStackArrays stringStackArrays = new StringStackArrays(5);
//        stringStackArrays.push("racecar");
//        stringStackArrays.push("apple");
//        stringStackArrays.palindrome(0);
//        stringStackArrays.palindrome(1);
//        stringStackArrays.push("orange");
//        stringStackArrays.push("banana");
//        stringStackArrays.push("kelp");
//        System.out.println(stringStackArrays);
//        stringStackArrays.pop();
//        System.out.println(stringStackArrays);
//        stringStackArrays.peek();
//        stringStackArrays.isEmpty();
//        stringStackArrays.isFull();
//        stringStackArrays.deleteStack();
//        System.out.println(stringStackArrays);
//        stringStackArrays.isEmpty();

//        StackLinkedList sLL = new StackLinkedList();
//        sLL.push(1);
//        sLL.push(2);
//        sLL.push(3);
//        sLL.push(4);
//        sLL.pop();
//        sLL.peek();
//        sLL.isEmpty();
//        sLL.deleteStack();
//        System.out.println(sLL);
//        sLL.isEmpty();

        StringStackLinkedList stringSLL = new StringStackLinkedList();
        stringSLL.push("hello");
        stringSLL.push("racecar");
        stringSLL.push("world");
        stringSLL.palindrome(0);
        stringSLL.palindrome(1);

    }
}
