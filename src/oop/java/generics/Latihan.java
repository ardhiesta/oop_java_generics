package oop.java.generics;

public class Latihan {
	class Kandang<E> {
	    private E hewan;
	    
	    public void setHewan(E x) {
	        hewan = x;
	    }
	    
	    public E getHewan() {
	        return hewan;
	    }
	}
	
	class Hewan{}
	
	class Kucing extends Hewan {}
	
	class Anjing extends Hewan {}
	
	public static void main(String[] args) {
		// latihan 
		// no. 1
		Kandang<Hewan> kandang1 = new Kandang<Kucing>();
		
		// no. 2
		Kandang<Kucing> kandang2 = new Kandang<Hewan>();
		
		// no. 3, penggunaan wildcard
		Kandang<?> kandang3 = new Kandang<Kucing>();
		kandang3.setHewan(new Kucing());
		
		// no. 4
		Kandang<Kucing> kandang4 = new Kandang<Kucing>();
		kandang4.setHewan(new Kucing());
		
		// no. 5
		Kandang kandang5 = new Kandang();
	    kandang.setHewan(new Anjing());
	}
}
