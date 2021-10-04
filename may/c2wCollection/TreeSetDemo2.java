import java.util.*;
class TreeSetDemo{

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();

		s.add(new Integer(10));
		s.add(5);
		s.add(8);
		s.add(new Integer(10));
		s.add(5);
		s.add(20);
		s.add(10);

		System.out.println(s);

	}
}