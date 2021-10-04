
import java.util.*;

class HashSetDemo{

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();

		System.out.println(" Adding a values in hashset ");
		hs.add(" Niket ");
		hs.add(" Damodar ");
		hs.add(" Tanmay ");
		hs.add(" Aadesh ");

		System.out.println(hs);

		System.out.println(" Iterate hashset by using for loop ");
		for(String str : hs)
			System.out.println(str);

		System.out.println("Iterate HashSet by using iterator");

		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		HashSet s = new HashSet();
		s.add(10);
		s.add("Damodar");
		s.add('a');
		s.add(98.79);

		System.out.println(s);
		s.clear();
		System.out.println(s);

		System.out.println(" clone() in hashset ");
		s = (HashSet) hs.clone(); 
		System.out.println(s);

		System.out.println(" contains() in hashset ");
		if(hs.contains(" Damodar ")); 
			System.out.println("Damodar name ahe ");

		if(hs.contains("Vaibhav"))
			System.out.println(" Vaibhav ahe ");
		else 
			System.out.println(" Vaibhav nahi ahe ");

		System.out.println(" isEmpty() in HashSet ");
		if(hs.isEmpty())
			System.out.println(" HashSet is empty ");
		else 
			System.out.println(" HashSet is not empty ");


	}
}
