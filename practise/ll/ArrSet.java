
import java.util.*;

class ArrSet{

	public static void main(String[] args) {
		
		ArrayList<Double> d = new ArrayList<Double>();

		d.add(20.00);
		d.add(89.76);
		d.add(45.78);
		d.add(67.43);


		for (int i = 0 ; i < d.size() ; i++ ) {
			
			System.out.println(d.get(i));
		}

		d.set(1,400.98);

		for (int i = 0 ; i < d.size() ; i++ ) {
			
			System.out.println(d.get(i));
		}
		
	}
}