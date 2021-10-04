class Scenario3{

	public static void main(String[] args) {
		
		System.out.println("Scenario 3");

		try{

			 System.out.println(10/0);
		}catch(ArithmeticException ae){

			System.out.println("Divide");
		}catch(Exception ee){

			System.out.println("by zero");
		}

		System.out.println("End of Scenario 3");
	}
}

// Compile time error