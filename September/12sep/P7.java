class P7{
	
	public static void main(String[] args) {
  
  int n = 1;
  		
  		char ch = 'A';  

		for (int i = 1 ; i <= 5 ; i++ ) {
			
			for (int j = 5 ; j >= i ; j-- ) {
				
				System.out.print(" ");

			}

               

			for (int k = 1; k <= 2*i-1 ; k++ ) {
				
				if(i % 2 == 1)
				{

					System.out.print(n + " ");
				}
				else{
                   
					System.out.printf("%c " , ch);
				}
              
			}
			
			n++;
            ch++;
			System.out.println();
		}
	}
}