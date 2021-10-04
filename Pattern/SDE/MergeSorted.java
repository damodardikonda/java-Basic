
//merge 2 sorted array witout using extra space

class MergeSorted{
	
	public static void main(String[] args) {
		
		int arr1[] = {1,4,7,8,10};
		int arr2[] = {2,3,9};

		int i = 0 , temp = 0 , temp1= 0 ;
		int j = 0 , k =  0;

		while((i < arr1.length) && (j < arr2.length)){

			if(arr1[i] < arr2[j])
				i++;
			if(arr1[i] > arr2[j]){

				temp = arr2[j];
				arr2[j] = arr1[i];
				arr1[i] =temp;
				i++;
				
				

				while(k <arr2.length-1){

					if(arr2[k] > arr2[k+1]){

						temp1 = arr2[k];
						arr2[k] = arr2[k+1];
						arr2[k+1] = temp1;
						System.out.println(arr2[k]  + "  " + arr2[k+1]);
						k++;
					}else{
						
					}

					System.out.println(k);

				}
				
			/*
				

			k = j-1;
			temp1 = arr2[j];
			while(k >-1 && arr2[k] > arr2[j]){

				arr2[j] = arr2[k];
				k--;
			}
			k++;
			arr1[k] = temp;*/
			
		}}

		for ( i = 0 ; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	for (j = 0 ; j < arr2.length  ; j++ ) {
		System.out.println(arr2[j]);
	}
	}
}