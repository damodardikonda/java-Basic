class Array2{

	public static void main(String[] args) {
		
		int a[] = new int[20];

int k = 1 ;
		for (int i = 0 ; i < 20 ; i++ ) {
			
			a[i]= k;
		   
		   k+=5;
		}

		for (int i = 0 ;  i < a.length; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}