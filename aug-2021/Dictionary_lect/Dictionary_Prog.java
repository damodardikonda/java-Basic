import java.util.*;

class Dictionary_Prog{

	public static void main(String[] args) {
		
		Dictionary dict = new Hashtable();

		dict.put("Virgin Codentic " , "Richard Bainson");
		dict.put("Blue Origin " , "Jeff Bezos");
		dict.put("SpaceX" , "Elon Musk ");

		System.out.println(dict);

		System.out.println(dict.size());

		System.out.println(dict.isEmpty());

		System.out.println(dict.get("Virgin Codentic"));

		System.out.println(dict.get("Blue"));

		System.out.println(dict.remove("SpaceX"));

		Enumeration itr = dict.elements();
		while(itr.hasMoreElements()){

			System.out.println(itr.nextElement());
		}

		Enumeration itr2 = dict.elements();
		while(itr2.hasMoreElements())
			System.out.println(itr2.nextElement());
	}
}