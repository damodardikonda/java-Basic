// B] 10 9 4 5 6 7 8 3

class P4E{

	public static void main(String[] args) {
		
		int size , temp = 0;

		int a[] = {

			10, 9, 4 ,5, 6, 7 ,8 ,3
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