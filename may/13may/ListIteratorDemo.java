import java.util.*;

class ListIteratorDemo{

	public static void main(String[] args) {
		
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);

		ListIterator lis = v.listIterator();

		System.out.println(" printing from front --->  back");
		while(lis.hasNext())
			System.out.println(lis.next());

		System.out.println(" printing from backword ---> font");
		while(lis.hasPrevious())
			System.out.println(lis.previous());

		System.out.println(" changin value of 30 to 80 ");
		while(lis.hasNext()){

			Integer i = (Integer) lis.next();

			if(i == 30)
				lis.set(80);
		}

		System.out.println(v);
	}
}