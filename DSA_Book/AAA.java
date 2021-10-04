import java.util.*;

class SS{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String data = sc.next();

		int len = data.length();

		if(len != 15)
			System.out.println("No");
		else
			System.out.println("Yes");

		String w[] = data.split(":");

		for(int i = 0 ; i < w.length ; i++){

			for(int j = 0 ; j < w[i] .length ; j++){

				int d = Character.getNumericValue( W[i][0]);

				if(d == '4' || d == '37' || d== '5')
					System.out.println("yes");
				else
					System.out.println("no");

			}
		}
	}
}