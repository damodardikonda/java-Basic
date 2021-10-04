import java.util.*;

class MapEntry_Iterator{

	public static void main(String[] args) {
		
		Map<String , String > m  = new HashMap<>();

		m.put("Amazon" , "Jeff Bezoz");
		m.put("Microsoft" , "Bil Gates");
		m.put("Apple" , "Steve Jobs");
		m.put("Facebook" , "Mark Zukerburg");
		m.put("SpaceX" , "Elon Musk");

		Set<Map.Entry<String , String>> entry = m.entrySet();

		Iterator<Map.Entry<String , String>> itr = entry.iterator();

		while(itr.hasNext()){

			Map.Entry<String , String> actualentry = itr.next();
			System.out.println(actualentry.getKey());
			System.out.println(actualentry.getValue());

			if(actualentry.getKey().equals("Apple")){

				actualentry.setValue("Tine Cook ");
			}
		}

		System.out.println(m);
	}
}