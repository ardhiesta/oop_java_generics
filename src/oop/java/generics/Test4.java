package oop.java.generics;

// https://www.geeksforgeeks.org/generics-in-java/
// generics type differ based on their type arguments
public class Test4<T> {
	// An object of type T is declared
	T obj;

	Test4(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}

	public static void main(String[] args) {
		// instance of Integer type
		Test4<Integer> iObj = new Test4<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test4<String> sObj = new Test4<String>("Informatika UNS");
		System.out.println(sObj.getObject());
		iObj = sObj; // This results an error
	}
}
