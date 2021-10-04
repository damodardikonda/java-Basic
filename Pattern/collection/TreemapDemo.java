import java.util.TreeMap;
import java.util.Map;
class TreeMapDemp{

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm =  new TreeMap<>();

		tm.put(1,"Damodar");
		tm.put(2,"Niket");
		tm.put(3,"Tanmay");
		tm.put(4,"Vaibhav");

		for(Map.Entry m : tm.entrySet()){

			System.out.println(m.getKey() + " " + m.getValue());
		}

		tm.put(5,"Damodar");
		tm.put(3 ,"Aditya");
		tm.put(0 , "da");


		for(Map.Entry m : tm.entrySet()){

			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}