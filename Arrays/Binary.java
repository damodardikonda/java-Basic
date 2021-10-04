class Binary{
	
	static void binSearch(int arr[] , int f ,int l ,int k){

		int mid =(f+l)/2;
        while(f<=l){
		
		if(k>arr[mid])
           {
           	f = mid+ 1;
           }else if(arr[mid] == k ){

           	System.out.println("Found ");
           }
           else{

           	l = mid-1;
           }



	     }


	     if(f>l){

	     	System.out.println(" Not Found ");
	     }
	}
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80};

		int key = 30 ;

		int last = a.length-1;

		binSearch(a,0,last,key);

	}
}