import java.util.*;

class SortedmapDemo{

	public static void main(String[] args) {
		
		SortedMap<String , String> s = new TreeMap<>();

		s.put("Cpp" , ".c");
		s.put("C" , ".c");
		s.put("Java" , ".java");
		s.put("Python", ".py");

		System.out.println(s);
	}
}