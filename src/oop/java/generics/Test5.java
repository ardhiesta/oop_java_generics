package oop.java.generics;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/generics-in-java/
// show Advantages of Generics : Type Safety, make errors to appear compile time than at run time 
public class Test5 {
	void method1() {
		// Creating an ArrayList without any type specified 
        ArrayList al = new ArrayList(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        al.add(10); // Compiler allows this 
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
  
        // Causes Runtime Exception 
        String s3 = (String)al.get(2); 
	}
	
	void method2() {
		// Creating a an ArrayList with String specified 
        ArrayList <String> al = new ArrayList<String> (); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // Now Compiler doesn't allow this 
        al.add(10);  
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
        String s3 = (String)al.get(2); 
	}
}
