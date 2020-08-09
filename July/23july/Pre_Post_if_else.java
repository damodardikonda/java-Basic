class Pre_Post_if_else{

	public static void main(String[] args) {
		
		int x=10;
		int y=11;

		if(++x == y++){    //11 == 11-->true

			System.out.println("In if Part");
			System.out.println(x); // 11
			System.out.println(y); //12

		} else {

			System.out.println("In Else Part");
			System.out.println(x);
			System.out.println(y);

		}

       System.out.println("Aag lage basti mein hum hamari massti mein");
	}
}