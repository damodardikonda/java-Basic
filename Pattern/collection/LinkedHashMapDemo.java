import java.util.LinkedHashMap;
import java.util.Map;
class LinkedHashMapDemo{

		public static void main(String[] args) {
			
			LinkedHashMap<String , String> lhm = new LinkedHashMap<String , String>();

			lhm.put("D" , "Damodar");
			lhm.put("A" , "Aditya");
			lhm.put(null , "Adesh");
			lhm.put("N" , "Niket");
			lhm.put("N" , "Adesh");

			for (String s : lhm.keySet() ) {
					
					System.out.println(s + " == " + lhm.get(s));
				}	

			System.out.println("LinkedHashMap contains Damodar "+ lhm.containsValue("Damodar"));

			System.out.println(" LinkedHashMap contains null  Key " + lhm.containsKey(null));

			//LinkedHashMap.keySet();


		}
}