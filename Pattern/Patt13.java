/*
   * 
   **
   ***
   ****
   *****
   ****
   ***
   **
   *



*/




class Patt13{

	public static void main(String[] args) {
		
		int i,j,k,m;

		for(i=1;i<5;i++){

			for(j=1;j<i;j++){

				System.out.print("*");
			}

			System.out.println();
		}

           for(m=1;m<=4;m++){
			for(k=3;k>m;k--){

				System.out.print("*");
			}
						System.out.println();
					}

		}
	
}