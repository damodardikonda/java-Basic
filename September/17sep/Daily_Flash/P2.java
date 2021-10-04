class P2{

	public static void main(String[] args) {
		int ch = 64 , num = 1,temp =1;
		for (int i = 1 ; i <= 4 ; i++ ) {
			
			for (int j = 1 ; j < 5 ; j++ ) {
				
				if(j < i ){

					System.out.print("  ");
				}

				else
					{ 
                          System.out.print((char)(ch+num)+" ");
                          num++;
					}
			}
          num=1;
			System.out.println();
		}
	}
}