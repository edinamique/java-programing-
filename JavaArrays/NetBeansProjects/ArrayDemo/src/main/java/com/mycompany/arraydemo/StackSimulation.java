
package com.mycompany.arraydemo;
public class StackSimulation {
    private int[] stack;   // array to hold stack elements
    private int top;       // index of the top element
    private int capacity;  // maximum size of the stack

    // Constructor to initialize stack
    public StackSimulation(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // stack is initially empty
    }

    // Push operation
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek operation (view top element)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test stack
    public static void main(String[] args) {
        StackSimulation stack = new StackSimulation(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}

