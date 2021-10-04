import java.util.*;
class LinkedMethod{

	public static void main(String[] args) {
		
		LinkedHashSet ll = new LinkedHashSet();
		ll.add("Apple");
		ll.add("Amazon");
		ll.add("Persistent");
		ll.add("Microsoft");
		ll.add("faceBook");
		
		System.out.println(ll);

		System.out.println(ll.contains("Microsoft"));

		System.out.println(ll.size());

		ll.remove("Amazon");
		System.out.println(ll);

		ll.clear();
		System.out.println(ll);
	}
}