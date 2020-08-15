/*

Pattern42
        A
      C B A
    E D C B A
  G F E D C B A
I H G F E D C B A

*/

class P42{
	
		
		public static void main(String[] args) {
			
			int fspace = 4 , bspace = 4;

			for(int i = 1 , ch = 64 ; i <= 9 ; i++){
                  
                  if(i % 2 == 0 )

                  	continue;
                  int temp = i;

                  for (int j = 0;j < 9 ; j++ ) {
                  	
                  	if( j < fspace || j > bspace){

                  		System.out.print(" ");
                  	}

                  	else{

                  		System.out.print((char) (ch+temp) + " ");
                  		temp--;
                  	}
                  }

                  fspace--;
                  bspace++;
                  System.out.println();
			}
		}
	
}