class Max_Diff{

	public static void main(String[] args) {
		
		System.out.println(" if i+1 is have a negetive value ");
		int arr[] = {14,12,70,15,95,65,22,30};

		int max_diff = 0  ;
		int a = 0 , b= 0 , max = 0 , min = 0  ;

		for (int j = 0; j < arr.length ; j++ ) {
			a  = Math.abs(arr[j]);
		
		for (int i = j+1 ;i < arr.length ; i++) {	
			b = Math.abs(arr[i]);

			if( b > a){
				
				max = b ;
				min = a;
			}else if ( a > b){

				max = a;
				min = b;
			}

			if(max - min > max_diff){
				
				max_diff = max - min;
			}
			}
		}

		System.out.println(max_diff);
				
		/*
		System.out.println(" is smallest_number < largest_num ");

		int arr[] = { 8, 19 , 3 ,2 ,7};
		int min = arr[0];
		int max = arr[1];
		int max_diff = 0;
		
		for (int i = j+1 ; i < arr.length ; i++ ) {
		
			for(int j= 0 ; j < arr.length ;j++){
			
			if(arr[j] - arr[i]> max_diff)
				max_diff = max - min;

		}}
}
		System.out.println(max_diff);

		*/
	}
}