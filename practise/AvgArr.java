class AvgArr{

	public static void main(String[] args) {
		
		int sum = 0 ;

		int a[] = {20,30,40,50,60};

		int len = a.length;

		for (int i = 0 ; i < a.length ; i++ ) {
			
			sum = sum + a[i];
		}

		float avg = (int) (sum/len);

		System.out.println("Avg is = " + avg);
	}
}