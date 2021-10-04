import java.util.*;

class HashSetDemo{

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add("Virat Kohli");
		s.add("MS Dhoni");
		s.add("Rohit Sharma");
		s.add("Rishabh Pant");
		s.add("Hardik Pandya");

		System.out.println(s);

		s.add("Virat Kohli");
		s.add("MS Dhoni");

		System.out.println(s);
	}
}