package Stacks;
import java.util.Arrays;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }
    //Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println(value + " successfully inserted");
        }
    }

    //implement pop method
    // Since using array lists wasn't used in your code it made the pop method a little trickier.
    // Learned I could use arraycopy to copy the array elements more efficiently so that way the
    // element could be physically removed from the array.
    public void pop() {
        if (isEmpty()) {
            System.out.println("Add value(s) to the stack first.");
        } else {
           int value = arr[topOfStack];
           topOfStack--;
           int[] newArray = new int[arr.length - 1];
           System.arraycopy(arr, 0, newArray, 0, topOfStack + 1);
           arr = newArray;
           System.out.println("Value successfully removed.");
        }
    }

    //implement peek
    public void peek() {
        if(isEmpty()) {
            System.out.println("Add value(s) to the stack first.");
        } else {
            int value = arr[topOfStack];
            System.out.println("Peek: " + value);
        }
    }

    //implement delete a stack
    public void deleteStack() {
       int [] newArray = new int[0];
       arr = newArray;
        while (topOfStack != -1) {
            topOfStack--;
        }
        System.out.println("Entire stack successfully deleted.");
    }

    @Override
    public String toString() {
        return "StackArrays{" +
                "arr=" + Arrays.toString(arr) +
                ", topOfStack=" + topOfStack +
                '}';
    }
}
