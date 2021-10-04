import java.util.*;
import java.util.Map; 	 
class HashDemo{

	public static void main(String[] args) {
		

		Hashtable<Integer,String> hm = new Hashtable<>();
		hm.put(1,"Damodar");
		hm.put(2 , "Niket");
		hm.put(3,"Adesh");

		for (Map.Entry m : hm.entrySet() ) {
			
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hm);

		hm.put(4 , "Aditya");
		hm.put(3 , " Akash");


		System.out.println(hm);
		hm.remove(4);
		
		System.out.println(hm);

		hm.putIfAbsent(4, "Aditya");
		
		for (Map.Entry m : hm.entrySet() ) {
			
			System.out.println(m.getKey() +" " + m.getValue());
		}

		hm.putIfAbsent(3 , "XXXXXXXXXXXXXXXX");
		for (Map.Entry m : hm.entrySet() ) {
			
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		hm.putIfAbsent(6 , "zzzzzzzzzzzzzz");
		for (Map.Entry m : hm.entrySet() ) {
			
			System.out.println(m.getKey() +" " + m.getValue());
		}

	}
}