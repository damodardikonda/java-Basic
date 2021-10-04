import java.util.*;

class treeMapMethods{

	public static void main(String[] args) {
		
		SortedMap <String , String> s = new TreeMap<>();

		s.put("CPP" , ".cpp");
		s.put("C" , ".c");
		s.put("Python" , ".py");
		s.put("Java" , ".java");

		// firstKey()
		System.out.println("firstkey is "+s.firstKey());

		//lastkey()
		System.out.println("lastkey is "+s.lastKey());

		//keyset()
		System.out.println("keyset is "+s.keySet());

		//values()
		System.out.println("values are "+ s.values());

		//entrySet()
		System.out.println(s.entrySet());

		//headMap()
		System.out.println(s.headMap("Java"));

		//tailMap()
		System.out.println(s.tailMap("Java"));

		//subMap()
		System.out.println(s.subMap("C" , "Java"));

		
	}
}