import java.util.ArrayList;
class ArrayList2{

	public static void main(String[] args) {
		
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(20);
	
		System.out.println(" set() for updating value of pos 2");
		arr.set(2, 500);
		System.out.println(arr); 

		System.out.println("---------------------------");
		System.out.println(" Converting Arraylist intro array ");
		Object []a = arr.toArray();

		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}

		System.out.println(" Trimtosize() ");
		arr.trimToSize();
		System.out.println(arr);
		System.out.println("---------------------------");
	
		for ( int i = 0 ; i < arr.size() ; i++ ) 
			System.out.println(arr.get(i));
	

		arr.remove("20");
		arr.remove("40");
		
		
		for ( int i = 0 ; i < arr.size() ; i++ ) 
			System.out.println(arr.get(i));
		
	}
}