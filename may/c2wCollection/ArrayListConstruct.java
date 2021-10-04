import java.util.*;

class ArrayListDemo{

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("Amazon");
		arr.add("Microsoft");
		arr.add("Flipkart");
		arr.add("Sony");
		arr.add("Veritas");
		arr.add("Amazon");

		System.out.println(arr);

		System.out.println("printin each element in ArrayList");
		for (int i = 0 ; i < arr.size() ; i++ ) {
			
			System.out.println(arr.get(i));
		}

		// Adding of element in pos 2
		arr.add(3,"oracle");
		System.out.println(arr);

		// Printing element of sprecific value
		int x = arr.indexOf("Amazon");
		System.out.println(x);

		// Printing element of specific value from last
		int y = arr.indexOf("Amazon");
		System.out.println(y);

		//remove() by using index
		System.out.println(arr.remove(2));

		// remove() by using value
		System.out.println(arr.remove("Amazon"));

		// clone() 
		ArrayList arr2 = (ArrayList)arr.clone();
		System.out.println(arr2);

		//removeAll() --> eleting all element from arraylist2
		arr2.removeAll(arr);
		System.out.println(arr2);
		System.out.println(arr);

		// clone() 
		ArrayList arr3 = (ArrayList)arr.clone();
		System.out.println(arr3);

		// clear arr2;
		arr3.clear();
		System.out.println(arr3);
	}
}