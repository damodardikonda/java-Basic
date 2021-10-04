import java.util.*;
class HashMap_Method{

	public static void main(String[] args) {
		
		Map<String , String> m = new HashMap<String, String>();

		//put()
		m.put("Amazon" , "Jeff Bezoz");
		m.put("Microsoft" , "Bil Gates");
		m.put("Apple" , "Steve Jobs");
		m.put("Facebook" , "Mark Zukerburg");
		m.put("SpaceX" , "Elon Musk");

		System.out.println(m);

		//get()
		System.out.println(m.get("Apple"));

		//remove()
		m.remove("Amazon");// does not return anything

		//remove()
		System.out.println(m.remove("Apple"));// return value of Apple

		//containsKey()
		System.out.println(m.containsKey("SpaceX")); // true

		//containsValue()
		System.out.println(m.containsValue("Amazon")); // false

		//isEmpty()
		System.out.println(m.isEmpty()); // false

		// size()
		System.out.println(m.size());//3

		//keySet()
		System.out.println(m.keySet());

		//values()
		System.out.println(m.values());
		
		//entryset()
		System.out.println(m.entrySet());
	}
}