class Array{

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[4] = 50;

		for (int i = 0  ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}


		System.out.println(a[1]);

	}
}