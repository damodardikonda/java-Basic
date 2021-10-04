import java.util.*;
class StrArr{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s[] = new String[5];

		for (int i = 0 ; i < s.length ; i++ ) {
			
			s[i] = sc.next();
		}

		for (int i = 0 ; i < s.length ; i++ ) {
			
			System.out.println(s[i].toLowerCase());
		}

	}
}