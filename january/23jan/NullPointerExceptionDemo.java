class NullPointerExceptionDemo{

	int x = 10 ;

	public static void main(String[] args) {
	
		try{

			NullPointerExceptionDemo ne = null ;
			System.out.println(ne.x);
		}	

		catch(NullPointerException  e ){

			System.out.println("Null Pointer Exception yenar");
		}
 			
 			System.out.println(" Exception zal complete");
	}
}