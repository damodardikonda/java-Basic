class Array_Initialise{

	public static void main(String[] args) {
		
		int arr[] = {10,20,30}; //allowed

		//int arr[3]={10,20,30}  ; not allowed

		int a2[];

		/*
		     a[0] = 10;
		     a[1] = 20;
	      */
	   
	   int a[] ={10,20,30};

	   a[0] = 10;
	   a[1] = 10;
	   a[2] = 10;


	   for (int i = 0 ; i < 3 ; i++ ) {
	   	
	   	  System.out.println(a[i]);
	   }


         /* 
	   int a1[] ={}

	   a1[0] = 10;
	   a1[1] = 10;
	   a1[2] = 10;
       */


	}
}