import java.util.Vector;
import java.util.List;
class VectorCreate{

	public static void main(String[] args) {
		
		System.out.println(" By Using First Way ");
		Vector<Integer> vect = new Vector<>();
		int x = vect.capacity();
		System.out.println("capacity of vetcor is = " + x);
		System.out.println(" Size() vector is = " + vect.size());
		vect.add(10);
		vect.add(10);
		vect.add(10);
		vect.add(10);
		vect.add(10);
		vect.add(10);
		vect.add(10);
		vect.add(10);
		vect.add(10);
		x = vect.capacity();
		System.out.println("capacity of vetcor is = " + x );
		System.out.println(" Size() of vector is = " + vect.size());
		vect.add(10);
		vect.add(10);
		vect.add(10);
		System.out.println(vect);
		x = vect.capacity();
		System.out.println("capacity of vetcor is = " + x);
		System.out.println("------------------------------------------");


		System.out.println(" By Using 2nd way ");
		Vector<Integer> v = new Vector<>(5);
		System.out.println(" Size() vector is = " + v.size());
		int y = v.capacity();
		System.out.println("capacity of vetcor is = " + y );
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		y = v.capacity();
		System.out.println("capacity of vetcor is = " + y );
		System.out.println(" Size() vector is = " + v.size());
		System.out.println("------------------------------------------");	
		

		System.out.println(" By Using 3nd way ");
		Vector<Integer> vt = new Vector<>(5 , 10);
		x = vt.capacity();
		System.out.println("capacity of vetcor is = " + x );
	
		System.out.println(" Size() vector is = " + vt.size());

		vt.add(10);
		vt.add(10);
		vt.add(10);
		vt.add(10);
		vt.add(10);
		vt.add(10);
		x = vt.capacity();
		System.out.println("capacity of vetcor is = " + x );
		System.out.println(" Size() vector is = " + vt.size());


		System.out.println(" Check Whether variable is present or not by using contain() ");
		System.out.println(" 10 in Vt = " + vt.contains(10));		

		System.out.println("print elements from post 2");
		System.out.println(vt.elementAt(2));

			
	}

}