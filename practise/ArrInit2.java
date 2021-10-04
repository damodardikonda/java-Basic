class ArrInit{

	public static void main(String[] args) {
		
		int a[] = new int[5];

		a[4 ] = 20;

		a[2] = 50;
		a[0] = 30;
		a[1]=23;
		a[3] = 980;

		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}