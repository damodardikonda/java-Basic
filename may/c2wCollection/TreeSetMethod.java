import java.util.*;

class TreeSetMethod{

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		s.add("CPP");
		s.add("C");
		s.add("React");
		s.add("Python");
		s.add("Android");
		s.add("Java");

		System.out.println(s);

		//first()
		System.out.println(s.first());

		//last()
		System.out.println(s.last());

		//headSet(object)
		System.out.println(s.headSet("CPP"));

		//tailset(object)
		System.out.println(s.tailSet("CPP"));

		//subset(object1 , object2 )
		System.out.println(s.subSet("C" , "Python"));
	}
}