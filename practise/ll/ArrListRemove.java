import java.util.*;

class ArrLR{

	public static void main(String[] args) {
		

		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		a.add(40);

		a.add(40);

		a.add(40);
		for (int i = 0 ; i < a.size() ; i++ ) {
			
			System.out.println(a.get(i));
		}

		a.remove(2);

		System.out.println("After Removing position ele = ");

		for (int i = 0 ; i < a.size() ; i++ ) {
			
			System.out.println(a.get(i));
		}

	//	a.remove(Integer.valueOf(40));

		a.removeAll(Arrays.asList(2));
		System.out.println("After Removing ele = ");

		for (int i = 0 ; i < a.size() ; i++ ) {
			
			System.out.println(a.get(i));
		}		
	}
}