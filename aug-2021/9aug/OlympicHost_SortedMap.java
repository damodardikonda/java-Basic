import java.util.*;

class OlympicHost{

	public static void main(String[] args) {
		
		TreeMap<Integer , String > host = new TreeMap<>();

		host.put(2000 , "Austrelia");
		host.put(2004 , "Greece");
		host.put(2008 , "China");
		host.put(2012 , "UK");
		host.put(2016 , "Brazil");

		System.out.println(host);

		host.putIfAbsent(2000 , "Japan");
		System.out.println(host);

		System.out.println(host.entrySet());

		System.out.println(host.keySet());

		System.out.println(host.values());

		System.out.println(host.get(2012));

		System.out.println(host.getOrDefault(2024 , "France"));

		System.out.println(host.getOrDefault(2012 , "France"));

		System.out.println(host.remove(2008));

		System.out.println(host.replace(2012 , "London"));
		System.out.println(host);
		System.out.println("-------------");
		System.out.println(host.replace(2012 , "London" , "UK"));
	}
}