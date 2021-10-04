class Bubble{
	

	static void Bsort(int a[]){

		int temp = 0;
		int n = a.length;

		for(int i = 0 ; i < n ; i++ ){

			for (int j = 1 ; j < (n-i) ;j++ ) {
				
				if(a[j-1] > a[j]){

					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int a [] = {89,56,34,21,3,9,59,2,1,4,101};

		System.out.println(" Befor Sorting ");
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
                 
                 Bsort(a);

		System.out.println(" After  Sorting ");
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}