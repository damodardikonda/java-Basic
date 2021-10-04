class Pattern3{

	public static void main(String[] args){

		int count = 5;
		for (int i = 1; i<=5 ; i++ ) {
			for (int j=1;j<=5 ;j++ ) {
				if(j>=count){
					System.out.print("\t" +j*j);
				}
				else{
					System.out.print("\t");
				}
			}
			count--;
			System.out.println();
		}
	}
}