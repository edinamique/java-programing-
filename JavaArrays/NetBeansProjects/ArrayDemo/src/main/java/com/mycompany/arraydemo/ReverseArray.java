
package com.mycompany.arraydemo;
public class ReverseArray {
    public static void main(String[] args) {
        // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Display original array
        System.out.print("Original array: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Reverse the array
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Display reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}

