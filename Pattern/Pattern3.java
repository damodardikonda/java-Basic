class Pattern3{
	
	public static void main(String[] args) {
		
		int num=10;
		for(int i =0 ; i<4 ;i++){

			for(int j=4; j!=i ;j--) {

              System.out.print(num + " ");
              num--;				
			}

			System.out.println();
		}
	}
}