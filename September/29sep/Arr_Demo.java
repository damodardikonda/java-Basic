class Arrdemo1{
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};-

		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println(a[i]);
		}

		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
	
       
		for (int i = 0 ; i < 5 ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}