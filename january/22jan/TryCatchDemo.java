class TryCatchDemo{

	public static void main(String[] args) {
		
		System.out.println(" Before Exceution ");

		TryCatchDemo obj = null ;

		try{

			obj.fun();

		}catch (Exception x){

			System.out.println(" Handling Exception ");
		}

		System.out.println("After Exception ");
	}
}