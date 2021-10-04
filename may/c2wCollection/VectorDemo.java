import java.util.*;

class VectorDemo{

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(" vector capacity = " + v.capacity());
		System.out.println("vector size = " + v.size());

		v.addElement(10);
		v.add(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(" vector capacity = " + v.capacity());
		System.out.println("vector size = " + v.size());

		v.addElement(60);
		v.addElement(70);
		v.addElement(10);
		v.add(20);
		v.addElement(30);

		System.out.println(" vector capacity = " + v.capacity());
		System.out.println("vector size = " + v.size());

		v.addElement(60);

		System.out.println(" vector capacity = " + v.capacity());
		System.out.println("vector size = " + v.size());

		Enumeration e = v.elements();
		while(e.hasMoreElements()){

			System.out.println(e.nextElement());
		}
	}
}