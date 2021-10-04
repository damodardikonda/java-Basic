
import java.util.*;

class SearchLL{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		boolean f = false;
		l1.add(10);
		l1.add(20);

		l1.add(50);

		l1.add(70);

		l1.add(200);

		l1.add(500);

		for (int i = 0 ; i < l1.size() ; i++) {
			
			if(num == l1.get(i))
				f = true;
			
		}

		if(f==true)
			System.out.println("Number is Found");
		else
			System.out.println("Not Found");
	}
}