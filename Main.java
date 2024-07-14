package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println(stackArrays);
        stackArrays.pop();
        System.out.println(stackArrays);
        stackArrays.peek();
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.deleteStack();
        System.out.println(stackArrays);
        stackArrays.isEmpty();

    }
}
