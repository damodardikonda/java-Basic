import java.util.*;

class DecideVCapcity{

	public static void main(String[] args) {
		
		Vector v = new Vector(11,5);

		System.out.println(" vector capacity is " + v.capacity());
		v.add(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		v.addElement(70);
		v.addElement(80);
		v.addElement(90);
		v.addElement(100);
		v.addElement(110);

		System.out.println(" After adding 11 elements = " + v.capacity());
		v.addElement(120);

		System.out.println(" After adding 12 element " + v.capacity());

	}
}