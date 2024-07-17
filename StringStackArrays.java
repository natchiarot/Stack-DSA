package Stacks;
import java.util.Arrays;

// use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar
public class StringStackArrays {
    String [] arr;
    int topOfStack;

    public StringStackArrays(int size){
        this.arr = new String[size];
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
    public void push(String value){
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
            String value = arr[topOfStack];
            topOfStack--;
            String[] newArray = new String[arr.length - 1];
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
            String value = arr[topOfStack];
            System.out.println("Peek: " + value);
        }
    }

    //implement delete a stack
    public void deleteStack() {
        String [] newArray = new String[0];
        arr = newArray;
        while (topOfStack != -1) {
            topOfStack--;
        }
        System.out.println("Entire stack successfully deleted.");
    }

    public boolean palindrome(int value) {
        boolean isPalindrome = false;
        if (value < 0 || value >= arr.length) {
            return false;
        }
       String[] separatedWord = arr[value].toString().split("");

        // Found something similar to this logic on https://www.scaler.com/topics/reverse-an-array-in-java/
        // With a bit of tweaking it worked for this.
        for (int i = 0; i < arr.length / 2; i++) {
            if (separatedWord[i].equalsIgnoreCase(separatedWord[separatedWord.length - i - 1])) {
                    isPalindrome = true;
            }
        }

        if (isPalindrome) {
            System.out.println(arr[value] + " is a palindrome.");
        } else {
            System.out.println(arr[value] + " is not a palindrome.");
        }

        return isPalindrome;
    }

    @Override
    public String toString() {
        return "StringStackArrays{" +
                "arr=" + Arrays.toString(arr) +
                ", topOfStack=" + topOfStack +
                '}';
    }
}
