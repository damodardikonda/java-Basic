import java.util.*;
class HashSetMethod{

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();

		hs.add("Virat Kohli");
		hs.add(" MS Dhoni");
		hs.add(" Rishabh Pant ");
		hs.add("Rohit Sharma");
		hs.add("Hardik Pandya");
		hs.add("KL Rahul");

		Iterator itr = hs.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		// Shreyas Ayyer is present or not
		System.out.println(hs.contains("Shreyas Ayyer"));

		// size of hashset() is 
		System.out.println(hs.size());

		//removing rishabh pant 
		hs.remove(" Rishabh Pant ");

		System.out.println(hs);

		hs.clear();

		System.out.println(hs);
	}
}