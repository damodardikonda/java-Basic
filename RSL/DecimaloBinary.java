class DecToBin{

	public static void toBinary(int decimal){

		int index = 0;
		int arr[] = new int[40];

		while(decimal > 0){

			arr[index++] = decimal % 2 ;
			decimal = decimal / 2;

		}

		for (int i = index -1 ; i >= 0; i-- ) {
			
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		//System.out.println(Integer.toBinaryString(10));

		toBinary(10);
	}
}