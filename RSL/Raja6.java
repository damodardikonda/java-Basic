
import java.util.Scanner;
class R6{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int count[] = new int[str.length()];

		for (int i = 0 ; i < str.length() ; i++ ) {
			
			char x = str.charAt(i);

			if(x == 'b' || x == 'B')
				count[0]++;
			else if (x == 'F' || x =='f')
				count[1]++;
			else if (x == 'j' || x == 'J')
				count[2]++;
			else
				count[3]++;
		}

		System.out.print(" b = " + count[0] + " f = " + count[1] + " j = " + count[2] + " other = " + count[3]);
	}
}