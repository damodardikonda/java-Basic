class Second_Large_diff{

	public static void main(String[] args) {
		
		System.out.println(" if smallest_index_no > larest_index_no is allowed == output sould be 8");
		
		System.out.println(" if i+1 is have a negetive value ");
		int arr[] = { 39,8, 19 , 3 ,2 ,7};

		 int max_diff = 0 , second_max = 0 ;
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
				second_max =  max_diff;
				max_diff = max - min;
			}
			}
		}

		System.out.println(max_diff);
		System.out.println(second_max);
			}
}