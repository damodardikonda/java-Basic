import java.util.Scanner;
class ScanClass{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int num = sc.nextInt();
		String a = sc.next();
		char aa = sc.next().charAt(0);


		System.out.println("Hey , My name is " + name + " and my roll number is " + num + " my grade is " + aa + " My stream is " + a);
	}
}