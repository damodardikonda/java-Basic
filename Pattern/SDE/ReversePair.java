/*

	Given an array of numbers, we call(i ,j ) an important reverse pair if i < j and num[i] > 2*nums[i]
*/

import java.util.ArrayList;
class ReversePair{
	public int mergesorted(int arr[] , int start , int mid , int end){

		int  j = mid+1;
		int count = 0 ;
		for (int i = 0 ; i <=mid; i++ ) {
			
			 while(j <= end && arr[i] > 2*arr[j]){

			 	count = count+ (j - (mid+1));
			 
			 }

			 return count;
		}

		ArrayList<Integer> temp = new ArrayList<>();
		int left = start;
		
		int right = mid+1;	
		
		while(left <= mid && right <= end ){
			if(arr[left] <= arr[right])
				temp.add(arr[left++]);
			else
				temp.add(arr[right++]);
		}

		while(left <=  mid){
			temp.add(arr[left++]);
		}

		while(right <= end)
			temp.add(arr[right++]);

		for (int i = start ; i <= end ; i++ ) {
			
			arr[i] = temp.get(i-start);
		}
		return count;
	}


	public int mergesort(int arr[] , int start , int end){

		int mid , count = 0;

		if(start >= end){
			return 0;
		}
		mid = (start+end)/2;
		count += mergesort(arr, start,mid);
		count+= mergesort(arr,mid+1,end);
		count+= mergesorted(arr,0,mid,end);
		
		return count;
	}
	public static void main(String[] args) {
		
		ReversePair rp = new ReversePair();
		int arr[] = {40,25,19,12,9,6,2};

		int count = rp.mergesort(arr , 0 , arr.length-1);
		System.out.println("count = "+count);
	}
}
