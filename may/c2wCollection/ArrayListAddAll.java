import java.util.*;

class ArrayListDemo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Damodar");
		al.add("Rushi");
		al.add("Ak");
		al.add("AG");
		al.add("Munna");
		al.add("SUBU");

		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add("Niket");
		al2.add("Adesh");
		al2.add("Aditya");
		al2.add("Tonny");

		System.out.println(al2);

		al2.addAll(al);
		Iterator itr = al2.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
	}
}