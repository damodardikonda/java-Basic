
import java.util.*;

class ReverseFor{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);

		int num = sc.nextInt();

		for (int i = 10 ; i >=1  ; i-- ) {
			
			 int mul = num * i;
			 System.out.print(mul + " ");
		}
	}
}