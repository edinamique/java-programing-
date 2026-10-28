/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraydemo;
import java.util.Scanner; 

/**
 *
 * @author ADMIN
 */
public class java2dDemo {
    
public static void main(String[] args) { 
int array2d[][] = {{11,22},{33},{44,55,66}}; 
System.out.println("Values in the array are"); 
for(int row = 0;row<array2d.length;row++){ 
for(int col=0;col<array2d[row].length;col++){ 
System.out.print(array2d[row][col]+" "); 
} 
System.out.println(); 
} 
} 
} 

