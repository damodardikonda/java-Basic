//C] 10 8 56 23 45 97

class P4F{

	public static void main(String[] args) {
		
		int size , temp = 0;

		int a[] = {

			10, 8, 56, 23, 45, 97
					} ;
         size = a.length;

		for (int i = 0 ; i < size ; i++ ) {
			
			for (int j = i+1 ; j < size ; j++ ) {
				
				if(a[i] > a[j]){

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} 


			}


		}

		System.out.println(a[size-2] + " is second largest number");
	}
}