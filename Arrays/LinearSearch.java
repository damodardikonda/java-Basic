class Linear{
	
	static int search(int a[] , int x){

		for (int i = 0 ; i <a.length ; i++ ) {
			
			if(a[i] == x)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,60,70};
	int x = 30;

	int res = search(a,x);
 
    if(res == 1)
    	System.out.println(" Found at " + res);
    else

    System.out.println(" Not Found  " );
    

	}
}