class CountFor{

	public static void main(String[] args){
        int count = 0 ;
		for (int num = 12345678, rem =0 ; num!=0 ; num=num/10 ) {
			
			rem = num % 10;
			count++;
		}

		System.out.println("Count is = " + count);
	}
}