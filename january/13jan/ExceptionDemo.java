class ExceptionDemo{

	public static void main(String[] args) {
		
		System.out.println(" In Main");

		ExceptionDemo obj = null ; //new ExceptionDemo();
		obj.fun();

 		System.out.println("End main");
	}


	void fun(){

		System.out.println(" In Fun ");
		
		gun();

		System.out.println(" End Fun");

	}

	void gun(){

		System.out.println(" In Gun");

		System.out.println(10/0);

		System.out.println(" End - Fun");
	}
}