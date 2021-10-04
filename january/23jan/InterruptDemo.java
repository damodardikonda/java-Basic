import java.util.Scanner;

class InterruptDemo{

	public static void main(String[] args) {
		
		try{

			System.out.println(10/0);
		}catch (InputMisMatchException  np){

			System.out.println(" Input Miss Match  Exception");
		}

		System.out.println(" Endede");
	}
}