package oop.java.generics;

// https://www.geeksforgeeks.org/generics-in-java/
// defined generics functions
public class Test3 {
	// A Generic method example
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}
	
	public static void main(String[] args) 
    { 
         // Calling generic method with Integer argument 
        genericDisplay(11); 
   
        // Calling generic method with String argument 
        genericDisplay("Informatika UNS"); 
   
        // Calling generic method with double argument 
        genericDisplay(1.0); 
    } 
}
