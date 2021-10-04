class Insert{

     static void Ins(int array[]){

     	int n = array.length;

     	for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
	public static void main(String[] args) {
		
		int a[] = { 10 ,20,5,3,2,50,60};

		for (int i = 0 ; i <a.length ; i++ ) {
			
			System.out.print(a[i] + " ");
		}


		Ins(a);

		System.out.println(" After sorting");
	
      
		for (int i = 0 ; i <a.length ; i++ ) {
			
			System.out.print(a[i] + " ");
		}


	}
}