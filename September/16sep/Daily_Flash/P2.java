class Pattern2{

	public static void main(String[] args){

		int count = 5;
		for (int i = 1; i<=5 ; i++ ) {
			for (int j=1;j<=5 ;j++ ) {
				if(j>=count){
					if(i+j == 7 || i+j == 9)
						System.out.print(" 1");
					else
						System.out.print(" 0");
				}
				else{
					System.out.print("  ");
				}
			}
			count--;
			System.out.println();
		}
	}
}