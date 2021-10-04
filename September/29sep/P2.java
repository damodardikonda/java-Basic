class P2{
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(arr[i] %2 == 0){

				System.out.println(arr[i]);
			}
		}
	}
}