class Selection{

	static void SelectionSort(int a[]){

		int temp =0;
		int index=0;
        int n = a.length;
		for (int i = 0; i < n-1 ; i++ ) {
			
			 index = i;
			for (int j = i+1;  j < n  ; j++) {
				
				if(a[j] < a[index]){
               
               index = j;

				}
				}

					temp = a[index];
					a[index] = a[i];
					a[i] = temp;
				
			}
		}
	
	
	public static void main(String[] args) {
		
		int a [] = {89,56,34,21,3,9,59,2,1,4,101};

		System.out.println(" Befor Sorting ");
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
                 
                 SelectionSort(a);

		System.out.println(" After  Sorting ");
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		
	}
}

}