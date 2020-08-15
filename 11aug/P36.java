/*

        1
      3 3 3 
    5 5 5 5 5 
  7 7 7 7 7 7 7
9 9 9 9 9 9 9 9 9 


*/

class P36{
	
	public static void main(String[] args) {
		
		int k = 0, num = 1;

		for (int i = 1 ; i <= 5 ; i++,k=0 ) {
			
			for(int j = 1 ; j <= 5-i ; j++){
				System.out.print(" ");
			}

           while(k != 2 *i - 1){

           	System.out.print(num+" " );
           	k++;
           }
           num = num + 2;
           System.out.println();
		}
	}
}
