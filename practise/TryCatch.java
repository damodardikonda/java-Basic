class ExceptionDemo{

	public static void main(String[] args) {
		
		System.out.println("Before Execution");

		try{

			System.out.println(10/0);
		}

		catch(Exception e){

			System.out.println("Including all class handlers");
		}

		catch(ArithmeticException ae){

			System.out.println("Divide by zero");
		}
      
      System.out.println("After Execution");
	}
}