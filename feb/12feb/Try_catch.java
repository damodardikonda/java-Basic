class Core{

	int x = 20;
}

class TryCatch{

	public static void main(String[] args) {
		
		System.out.println("stmt-1");

		try{

			System.out.println("stmt-2");
			System.out.println(10/0);
			System.out.println("stmt-3");
		}
		catch(ArithmeticException ae){

			System.out.println("stmt-4");
		}
		System.out.println("stmt-5");
	

		System.out.println("stmt-6");

		try{

			System.out.println("stmt-7");

			Core obj = null;
			System.out.println(obj.x);
			System.out.println("stmt-8");
		}
		catch(NullPointerException ae){

			System.out.println("stmt-9");
		}
		System.out.println("stmt-10");

	}
}