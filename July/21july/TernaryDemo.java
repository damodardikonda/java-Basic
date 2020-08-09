class TernaryDemo{

	public static void main(String args[]){

		int x=40;
		
		int y=50;

		int result;

		result= ( x < y ) ? x : y ;//40
		System.out.println(result);


		//OR

		System.out.println(( x < y ) ? x : y );//40



		//result=(x < y) ? System.out.println("X is less") : System.out.println("X is Greater");
		//System.out.println(result); error

         //(x < y) ? System.out.println("X is less") : System.out.println("X is Greater"); error


		String ans;

		ans=(x < y) ? "X is less" : "X is Greater";
		System.out.println(ans);

	}

}