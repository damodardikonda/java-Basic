//Sort an array of 0’s 1’s 2’s without using extra space or sorting algo
// takes 3 pointer , low== mid== high.
// Left side of Low sould be 00
// between mid and high  11
// right side of high = 2

class Array012{

	public static void sortArr(int arr[]){

			int low = 0;
			int high = arr.length-1;
			int mid = 0, temp= 0;

		int i = 0 ;

		while((mid <= high) || (i <= high)){
			System.out.println(" highg = "+ high);
			switch(arr[mid]){
				case 0:
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;					
					low++;
					mid++;
					break;

				case 1 :
					mid++;
					break;

				case 2:
					temp = arr[high];
					arr[high] = arr[mid];
					arr[mid] = temp;					
					high--;
					mid++;
			}
			System.out.println(i);
			i++;

}

		System.out.println(" aray op is ");
			for (int j = 0 ; j < arr.length ; j++ ) {
				
				System.out.println(arr[j]);
			}

			
			
		}
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,1,0,1,2,1,2,0,0,0,1};

		sortArr(arr);
	}
}