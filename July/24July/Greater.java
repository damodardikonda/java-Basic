import java.util.Scanner;

class Greater{

	public  static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		float a = sc.nextFloat(); 
		float b = sc.nextFloat();

		if(a>b){

			System.out.println(a + "  A is greater then B " );
		}else{

			System.out.println(b + "   B is Greater than A");
		}
	}
}