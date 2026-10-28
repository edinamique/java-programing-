
package com.mycompany.arraydemo;
public class ArrayDemo {   
public static void main(String[] args) { 
int sum = 0; 
int array[] = { 10, 0, 5, 7, 1, 0, 12, 22 }; 
for (int i = 0; i < array.length; i++) { 
System.out.print(array[i]+"\t|"); 
for(int j = 0; j < array[i]; j++){ 
System.out.print("="); 
} 
System.out.println(""); 
}}}