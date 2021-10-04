import java.util.*;

class Olympic{

	public static void main(String[] args) {
		
		TreeMap<Integer,String> host = new TreeMap<>();

		host.put(2000 , "Austrelia");
		host.put(2004 , "Greece");
		host.put(2008 , "China");
		host.put(2012 , "UK");
		host.put(2016 , "Brazil");
`
		System.out.println(host);

		System.out.println(host.firstKey());
		System.out.println(host.firstEntry());
		System.out.println(host.lastKey());
		System.out.println(host.lastEntry());
		System.out.println(host.higherKey(2008));
		System.out.println(host.lowerKey(2008));
		System.out.println(host.higherEntry(2008));
		System.out.println(host.lowerEntry(2008));
		System.out.println(host.ceilingKey(2008));
		System.out.println(host.floorKey(2008));
		System.out.println(host.pollFirstEntry());

	}
}