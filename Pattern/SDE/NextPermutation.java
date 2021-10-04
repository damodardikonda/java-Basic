/* samja list dili asel [1,3,2] ==> tr tyache all combination find out karayche 
[1,2,3]
[1,3,2]
[2,1,3] == ha tyachya pudhcha next permutation number ahe;
[2,3,1]
[3,1,2]
[3,2,1]

optimal soultion is === 1. check a[i] < a[i+1] number from left;
						2. then check a[length - 1] > a[i] if yes swap else length--;
						3.  after swapping sort element from i+1 --> lent


if [5,4,3,2,1] is an array then first first 2 condition will be failed ten directly apply 3rd codition
 */

class NextPermutation{

	void nextPermute(int[] arr){
		if(arr.length == 1)
			System.out.println(arr[0]);
		int i = arr.length-2;
		while(i>=0 && arr[i] >= arr[i+1])i--;

		if(i >= 0){

			int j = arr.length-1;

			while(arr[i] >= arr[j]) j--;
			swap(arr , i ,j);
		}
		reverse(arr,i+1 , arr.length-1);
	
		System.out.println(" Next permutatiuon is =" );
		for (int k = 0 ; k < arr.length ; k++) {
			
			System.out.print(arr[k]);
		}

	}

	public void swap(int arr[] , int i , int j){
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j]=  temp;
	}
	public void reverse(int arr[] , int i , int j){

		while(i < j) 
			swap(arr , i++ , j--);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,4,2};

		NextPermutation np =new NextPermutation();
		np.nextPermute(arr);
	}
}