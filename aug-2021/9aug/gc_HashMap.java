import java.util.*;

class gc_HashMap{

	public static void main(String[] args) {
		
		HashMap<String , Integer> h = new HashMap<>();
		String s1 = new String("Sushil Kumer");
		String s2 = new String(" PV Sindhu");

		

		h.put(s1 , 2);
		h.put(s2 , 3);

		System.out.println(h);

		s1 = null;
		System.gc(); // s1 null asel tari garbage collector tyala delete nahi karat

		System.out.println(h);
	}
}