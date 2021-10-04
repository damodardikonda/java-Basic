import java.util.*;

class WeakHashMapDemo{

	public static void main(String[] args) {
		
		WeakHashMap<String , Integer> h = new WeakHashMap<>();

		String s1 = new String("PV Sindhu");
		String s2 = new String("Sushil Kumar");

		h.put(s1 , 2);
		h.put(s2 , 3);

		System.out.println(h);

		s1 = null;
		System.gc();// s1 cha object ha gc gheun janar

		System.out.println(h);

	}
}