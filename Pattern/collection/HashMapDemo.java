import java.util.HashMap;
import java.util.Map;
class HashMapDemo{

	public static void main(String[] args) {
		
		HashMap<Integer , String> hs = new HashMap<>();
		hs.put(100 , "Damodar");
		hs.put(200 , "Niket");
		hs.put(300 , "Tanmay");
		hs.put(400 , "Aditya");
		hs.put(500 , "Adesh");

		System.out.println("Hashmap size is = " + hs.size());

		for (Map.Entry m : hs.entrySet() ) {
			
			System.out.print(m.getKey());
			System.out.println(m.getValue());
		}


		hs.put(400 ,"Vaibhav");
		hs.put(500 , "xyz");

		for ( Map.Entry m : hs.entrySet() ) {
			
			System.out.print(m.getKey());
			System.out.println(m.getValue());
		}
	}
}