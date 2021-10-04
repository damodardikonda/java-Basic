class Scenario1{

	public static void main(String[] args) {
		
		System.out.println("Scenario 1");

		try{

			 System.out.println(10/0);
		}catch(ArithmeticException ae){

			System.out.println("Divide");
		}catch(ArithmeticException ee){

			System.out.println("by zero");
		}

		System.out.println("End of Scenario 1");
	}
}

// Compile time error