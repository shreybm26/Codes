import java.util.Scanner;
class Stack {
    private int[] array;
    private int tos;
    public Stack(int size) {
        array = new int[size];
        tos = -1;
    }
    public void push(int element) {
        if (tos == array.length - 1) {
            System.out.println("Stack Overflow! Cannot push element " + element);
            return;
        }
        array[++tos] = element;
        System.out.println("Pushed " + element + " onto the stack");
    }
    public int pop() {
        if (tos == -1) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack");
            return -1;
        }
        int poppedElement = array[tos--];
        System.out.println("Popped " + poppedElement + " from the stack");
        return poppedElement;
    }
    public void display() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = tos; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}