import java.util.*;

class IteratorDemo{

	public static void main(String[] args) {
		
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);

		System.out.println(" Vector is " + v);


		System.out.println(" Iterating vector elements by using iterator()");
		Iterator  it =  v.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println(" remove the  elements from vector which are divisible by 4 through iterator() ");
		while(it.hasNext()){

				Integer i = (Integer) it.next();

			if( i % 4 == 0)
				it.remove();
		}

		System.out.println(" Vector is " + v);
	}
}