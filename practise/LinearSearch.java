class LinearSearch{

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,8,9,0};
		int flag = 0 , flag2 = 0;
		int key = 5;
		int key1 = 12;

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(arr[i] == key){
				flag = 1;
				break;
			}
		}


		if(flag == 1)
			System.out.println(" Key found");
		else 
			System.out.println(" Key is not found");	


		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(arr[i] == key1){
				flag2 = 1;
				break;
			}
			
		}
		

		if(flag2 == 1)
			System.out.println(" Key found");
		else 
			System.out.println(" Key is not found");	
	}
}