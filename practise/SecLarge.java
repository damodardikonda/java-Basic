class SecLarge{

	public static void main(String[] args) {
		
		int arr[] = {10,20,80,120,45,87,56};

		int i = 0 ;
		int firstlarge = arr[0];

		while(i < arr.length){

			if(arr[i] > firstlarge){

				firstlarge = arr[i];
			}

			i++;
		}

		int secondLarge = arr[0];

		int j = 0 ;
		while( j < arr.length){

			if((arr[j] > secondLarge) && (arr[j] != firstlarge)){

				secondLarge = arr[j];
			}
			j++;
		}

		System.out.println("Second large is " + secondLarge);
	}
}