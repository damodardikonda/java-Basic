import java.util.*;

class VectorMethod{

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement("Damodar");
		v.addElement("Rushikesh");
		v.addElement("Swapnya");
		v.addElement("Pandit");
		v.addElement("Damodar");
		v.addElement("Mandy");
		v.addElement("Gohil");

		if(v.isEmpty())
			System.out.println(" vector is empty ");
		else 
			System.out.println(" vector is not empty ");

		System.out.println("Elements at position 3 is " + v.elementAt(2) );

		System.out.println(" set Niket at position 5  " );
		 v.setElementAt("Niket" , 4);
		 System.out.println(" vector is " + v);

		System.out.println(" Remove element from perticular position");
		 v.removeElementAt(1);
		 v.removeElementAt(5);

		 System.out.println(" Remove element by name ");
		 v.removeElement("Damodar");

		 System.out.println(" After All Operation vector is ");
		 Enumeration e = v.elements();
		 while(e.hasMoreElements())
		 	System.out.println(e.nextElement());

	}
}