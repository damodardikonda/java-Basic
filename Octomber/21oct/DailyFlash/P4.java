import java.util.Scanner;

class P4{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 Strings");
		String s1 = sc.nextLine();

		String s2 = sc.next();

		if(s1.equals(s2)){

			System.out.println(" String is same");
		}else{

			System.out.println("String is not same");
		}
	}
}