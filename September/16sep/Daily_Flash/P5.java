class Pattern5{
	public static void main(String[] args) {
		
		int count = 6,num =1,temp = 1;

		for (int i =1; i<=5; i++) {
			num = temp;
			for (int j =1; j<=5 ;j++ ) {
				if(j<count){
					System.out.print(num + " ");
					num++;
				}
				else{
					System.out.print(" ");
				}
			}
			temp += 2;
			System.out.println();
			count--;
		}
	}
}