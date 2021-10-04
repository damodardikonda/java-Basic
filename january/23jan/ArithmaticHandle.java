class ArithmaticHandle{

	public static void main(String[] args) {
		
		System.out.println(" Try Started");
		try{

			System.out.println(10/0);
		}
		catch(ArithmeticException ae){

			System.out.println(" This is Arithmatic Exception");
		}


		System.out.println(" Exception is handled ");
	}
}