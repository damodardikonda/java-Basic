import java.util.Scanner;
class P2{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String s1 = new String(sc.next());
		String s2 = new String(sc.next());

		if(s1.startsWith(s2)){
			System.out.println("Yes");

		}
         else
         	System.out.println("No");

	}

}