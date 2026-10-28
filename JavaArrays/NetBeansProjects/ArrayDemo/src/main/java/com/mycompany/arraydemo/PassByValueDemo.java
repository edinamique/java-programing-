
package com.mycompany.arraydemo;

public class PassByValueDemo {
    public static void main(String[] args) { 
float value = 2.5f; 
System.out.println("Value before modification " + value); 
changeValue(value); 
System.out.println("Value after modification " + value); 
} 
public static void changeValue(float f) { 
f *= 2; 
System.out.println("Modified value " + f); 
} 
}
    
