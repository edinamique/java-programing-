
package com.mycompany.arraydemo;
public class ArrayToMethodDemo {
   public static void main(String[] args) { 
double price[] = { 12.20, 45.25, 78.10, 35.40, 78.50 }; 
System.out.println("Price before tax imposed"); 
display(price); 
addTax(price); 
System.out.println("Price after 12.75% tax imposed"); 
display(price); 
   }
public static void addTax(double p[]) { 
for (int i = 0; i < p.length;i++) { 
p[i] = p[i] + p[i] * 0.1275; 
} 
} 
public static void display(double p[]) { 
for (int i=0; i < p.length; i++) { 
System.out.println(p[i]); 

} 
}}