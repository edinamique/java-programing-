
package com.mycompany.arraydemo;
    import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        // Ask user for the element to search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Flag to check if found
        boolean found = false;

        // Search through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        // If not found
        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}

   
