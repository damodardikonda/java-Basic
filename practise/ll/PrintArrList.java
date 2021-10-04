
import java.util.*;

class ArrLP{

	public static void main(String[] args) {
		int n = 10 ;
		ArrayList<Integer> a = new ArrayList<Integer>(n);

		System.out.println("Adding Elem in Array List");
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		System.out.println(a.get(2));

		a.remove(2);
System.out.println(a.get(2));

		for (int i = 0 ; i < a.size() ; i++ ) {
			
			System.out.print(a.get(i) + " "); 
		}

		a.add(3,100);
		a.add(5,90);
		a.remove(3);
		for (int i = 0 ; i < a.size() ; i++ ) {
			
			System.out.print(a.get(i) + " "); 
		}

	}
}