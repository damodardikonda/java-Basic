class AvgCount{

	public static void main(String[] args) {
		
		int num = 12345 ;

		int rem = 0 , avg = 0 , count = 0;

		while(num != 0 ){

			rem = num % 10;
			count++;
			num/=10;

		} 

	     avg = count /2;

	     System.out.println(avg);
	}
}