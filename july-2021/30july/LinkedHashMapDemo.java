import java.util.*;

class LinkedDemo{

	public static void main(String[] args) {
		
		Map<String , String> m = new LinkedHashMap<String , String>();
		m.put("Amazon" , " Jeff Bezoz");
		m.put("Apple" , "Steve Job");
		m.put("Microsoft" , "Bill gates");
		m.put("FB" , "Marks Zukerburg");
		m.put("Spacex" , "Elon Musk");

		System.out.println(m);
	}
} 