import java.util.*;

class VectorCollection{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		Vector v = new Vector(al);
		System.out.println(v);

		v.addElement(60);
		v.addElement(70);

		Enumeration e = v.elements();

		while(e.hasMoreElements()){

			System.out.println(e.nextElements());
		}
	}
}