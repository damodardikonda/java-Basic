class Pre_Post_if_else3{

	public static void main(String[] args) {
		
		int x=10;
		int y=11;

		if(++x <= --y){    //11 == 10-->false

			System.out.println("In if Part");
			System.out.println(x); 
			System.out.println(y); 

		} else {

			System.out.println("In Else Part");
			System.out.println(x);//11
			System.out.println(y);//10

		}

       System.out.println("Aag lage basti mein hum hamari massti mein");
	}
}