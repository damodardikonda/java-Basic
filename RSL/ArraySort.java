class ArraySort{

	public static void main(String[] args) {
		
		int arr[] = {6,2,3,9,6,4};
		int low = arr[0] ;
		int high = arr.length-1;

		for(int i = 0, j=i+1; i < arr.length && j<arr.length;)
    {       
        if(arr[i] > arr[j])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;              
            i=0;
            j=i+1;
        } 
        else
        {
            i++;
            j++;
        }
    }

		for (int  j = 0 ; j < arr.length; j++) {
			
			System.out.println(arr[j]);
		}
	}
}