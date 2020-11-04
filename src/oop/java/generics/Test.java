package oop.java.generics;

// https://www.geeksforgeeks.org/generics-in-java
// We use < > to specify Parameter type 
public class Test<T> {
	// An object of type T is declared
	T obj;

	Test(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}

	// test run class Test
	public static void main(String[] args) {
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test<String> sObj = new Test<String>("Informatika UNS");
		System.out.println(sObj.getObject());
	}
}
// other resource https://www.baeldung.com/java-generics