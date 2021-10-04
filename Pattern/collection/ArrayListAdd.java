import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class ArraylistAdd{

	public static void main(String[] args) {
		
		System.out.println(" First way to create an arraylist");
		ArrayList<Integer> arr = new ArrayList<>();

		System.out.println(" Adding a value into Arraylist ");
		arr.add(5);
		arr.add(10);
		arr.add(5);
		arr.add(10);
		arr.add(5);
		arr.add(10);
		arr.add(5);
		arr.add(10);

		arr.add(3,80);
		arr.add(6,90);

		System.out.println(arr);
		System.out.print("--------------------------------------------------");

		System.out.println("Size() and get() in Arraylist");
		for (int i = 0 ; i < arr.size() ;i++ ) {
			
			System.out.println(arr.get(i));
		}
		System.out.print("--------------------------------------------------");

		System.out.print("indexOf() in arraylist");
		int val = arr.indexOf(5);
		System.out.println(" Position is = " + val);
		System.out.print("--------------------------------------------------");
		
		System.out.print(" LatsIndexOf() in ArrayList ");
		int lastindexof = arr.lastIndexOf(5);
		System.out.println(lastindexof);
		System.out.println("------------------------------------------------");

		System.out.println("remove() ");
		int xn = arr.remove(6);
		System.out.println(xn );
		System.out.println("------------------------------------------------");
/*
		System.out.println(" removerange() ");
		System.out.println(arr);
		arr = arr.removeRange(3, 7);
		System.out.println(arr);
*/
		System.out.println("Second way to create Arraylist");
		List<Integer> arr2 = new ArrayList<Integer>(5);
		System.out.println(" Adding a value into Arraylist ");
		arr2.add(5);
		arr2.add(10);
		arr2.add(5);
		arr2.add(10);
		arr2.add(5);
		arr2.add(10);
		arr2.add(5);
		arr2.add(10);

		System.out.println(arr2);
		System.out.print("--------------------------------------------------");

		System.out.println("addAll() in java");
		arr2.addAll(arr);
		System.out.println(arr2);
		System.out.print("--------------------------------------------------");	

		System.out.println(" Creating a arraylist using String");
		List<String> arr3 = new ArrayList<String>(5);

		System.out.println(" Adding a value into Arraylist ");
		arr3.add("damodar");
		arr3.add("bhaskar");
		arr3.add("dikonda");
		System.out.println(arr3);
		System.out.print("--------------------------------------------------");

		System.out.println(" clear() in ArrayList");		
		arr3.clear();
		System.out.println(arr3);
		System.out.print("--------------------------------------------------");

		arr3.add("damodar");
		arr3.add("bhaskar");
		arr3.add("dikonda");
		System.out.println(arr3);
		System.out.print("--------------------------------------------------");
	
		System.out.println(" clone() in ArrayList");
		System.out.println("clone() in java");
	//	List<String> arrCopy =  (ArrayList<String>) arr3.clone();
	//	System.out.println(arrCopy);	
		System.out.print("--------------------------------------------------");
		
		System.out.println(" contains() in arraylist");
		boolean flag = arr3.contains("damodar");
		System.out.println(flag);
		/*
		System.out.println("Iterator in java");

		Iterator it = arr3.iterator();

		while(it.hasNext()){

			System.out.println(it.next());
		}

	*/
		System.out.println("Enumeration in java");

		Enumeration e = arr3.elements();

		while(e.hasMoreElements())
			System.out.println(e.hasNext());
	}
}