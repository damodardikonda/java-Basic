import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
class Vector2{

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);

		System.out.println(" Elements on vector is ");
		for (int i =  0 ; i < v.size() ; i++ ) {
			
			System.out.println(v.get(i));
		}
		System.out.println(" Elements at first position "+v.firstElement());
		System.out.println(" hashcode = " + v.hashCode());

		// Enumerator in vector
		 Vector<String> vector = new Vector<String>();
 
    // Add elements into Vector
    vector.add("Chaitanya");
    vector.add("Shubham");
    vector.add("Apoorv");
    vector.add("Jin");
    vector.add("Jacob");
 
    // Get Enumeration of Vector elements 
    /*Enumeration en = v.elements();
 
    /* Display Vector elements using hashMoreElements()
     * and nextElement() methods. 
     */String x = "";
   // System.out.println("Vector elements are: ");
    //while(en.hasMoreElements())
    	 
      // System.out.println(en.nextElement());*/

    Iterator it = v.iterator();

    while(it.hasNext())
    	System.out.println(it.next());
  }
}