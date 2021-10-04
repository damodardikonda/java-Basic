class SecondLarge{

	static int findSecondLargest(int arr[]){

		int second = arr[0];
		int first = arr[0];


		int i = 1 ;

		while(i < arr.length){

			if(arr[i] > first ){
				second = first;
				first = arr[i];
			}
			i++;
		}
		return second;
	}
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60};
		int x = findSecondLargest(arr);
		System.out.println(" Second largest element is " + x); 
	}
}