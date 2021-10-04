class P2 {
	
	public static void main(String[] args){
		
		int a[] = { 25 , 14 ,56 ,15 ,36 ,56 ,77,18 ,29 ,49};

		for (int i = 0 ; i < a.length ; i++) {
			
			if(a[i] == 25 ){

				System.out.println("Index position of"+ i + "is " + i);
			}else if(a[i] == 77 ){

				System.out.println("Index position of " + i + " is " + i );
			}


		}

	}
}