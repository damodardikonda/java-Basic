/*

C-3.17 Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive, one
of which is repeated. Describe an algorithm for finding the integer in A that is
repeated.

*/

// 1 . BruteForce Approach
/*
class BF_Algo{

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,7,8,4};

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			for (int j = i ; j < arr.length; j++ ) {
				
				if(arr[i] == arr[j]){
					System.out.println(" Duplicate ");
					break;
				}
			}
		}

	}
}

*/

class Find_Duplicate{
	static void findout_duplicate(int arr[]){

		int fast = arr[0];
		int slow=arr[0];

		do{
			slow = arr[slow];
			fast=arr[arr[fast]];
		}while(slow != fast);

		fast = arr[0];

			while(slow != fast){
			slow = arr[slow];
			fast = arr[fast];
		}

		System.out.println( slow);
	}
	public static void main(String[] args) {
		
		int arr[] = {2,5,9,6,9,3,8,9,7,1};
		findout_duplicate(arr);
	}
}