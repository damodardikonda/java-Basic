class NestedTry{

	public static void main(String[] args) {
		
		System.out.println("Nested try-catch block");

		try{

			System.out.println("Outer try block");

			try{

				System.out.println("Inner try Block");
			}catch(ArithmeticException e){

				System.out.println("Inner Catch Block");
			}
		}catch(NullPointerException ne){

			System.out.println("Outer Catch block");

			try{

				System.out.println("Inner Catch Block");
			}catch(ArithmeticException ae){

				System.out.println("Inner Catch Block");
			}
		}

		finally{

			System.out.println(" finally Block");
		}
	}
}