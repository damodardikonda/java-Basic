import java.util.*;

class EnumerationDemo{

	public static void main(String[] args) {
		
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		Enumeration e = v.elements();
		

		System.out.println(v);


		System.out.println(" Printin element by enumeration ");
		while(e.hasMoreElements()){

			Integer i = (Integer)e.nextElement();

			if(i % 4 == 0)
				System.out.println(i);

		}


	}
}