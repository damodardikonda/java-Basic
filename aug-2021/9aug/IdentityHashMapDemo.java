import java.util.*;

class IdentityHashMapDemo{

	public static void main(String[] args) {
		
		IdentityHashMap<String , Integer> h = new IdentityHashMap<>();

		String s1 = new String("Sushil Kumar");
		String s2 = new String("Sushil Kumar");
		h.put(s1 , 2);
		h.put(s2 , 3);
		System.out.println(h);
	}
}