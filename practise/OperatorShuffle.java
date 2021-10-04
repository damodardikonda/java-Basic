


class OperatoeShuffle{

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 4; i++ ) {
		char c1 = '+' , c2 = '+' ,c3 = '+',c4 = '=';
		int a1 = 0 , a2 = 0 ,a3 = 0 ,a4 = 0;
				
				for (int j = 1 ; j <= 4 ; j++ ) {
				
					for (int k = 1 ; k <= 4; k++) {
										
						if(i == 1){

							c1 = '+';
							a1 = 4+3;
						}
						else if(i == 2){
							c2 = '-';
							a2 = 4-3;
						}
						else if(i == 3){
							c3 = '*';
							a3 = 4*3;
						}
						else if(i == 4){
							c4 = '/';
							a4 = 4/3;
						}

						if(j == 1){

							c1 = '+';
							a1 =a1+2;
						}
						else if(j == 2){
							c2 = '-';
							a2 = a2-2;
						}
						else if(i == 3){
							c3 = '*';
							a3 = a3*2;
						}
						else if(i == 4){
							c4 = '/';
							a4 = a4/2;
						}
						  


						if(k == 1){

							c1 = '+';
							a1 =a1+1;

				  System.out.println("4 " + c1 + " 3 " + c2 + " 2 " + c3 + " 1 = " + a1);
						}
						else if(k == 2){
							c2 = '-';
							a2 = a2-1;

				  System.out.println("4 " + c1 + " 3 " + c2 + " 2 " + c3 + " 1 = " + a2);
						}
						else if(k == 3){
							c3 = '*';
							a3 = a3*1;

				  System.out.println("4 " + c1 + " 3 " + c2 + " 2 " + c3 + " 1 = " +a3 );
						}
						else if(k == 4){
							c4 = '/';
							a4 = a4/1;

				  System.out.println("4 " + c1 + " 3 " + c2 + " 2 " + c3 + " 1 = " + a4);
						}
						  


					}
				}
			}	
	}
}