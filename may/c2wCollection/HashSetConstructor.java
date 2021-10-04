import java.util.*;

class HashSetConstructor{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Damodar");
		al.add("Niket");
		al.add("Rushi");
		al.add("Manthan");
		al.add("Damodar");
		al.add("Niket");
		al.add("Rushi");
		HashSet hs = new HashSet(al);

		Iterator itr = hs.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		

	}
}