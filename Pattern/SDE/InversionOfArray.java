/*

	so the problem is tat arrey should present in i < j and a[i] > a[j] format 
	[8,4,2,1] == > find out pair as like i < j and arr[i] > arr[j] if found then count pair++;

	[8,4,2,1] ==> (8,4),(8,2),(8,1),(4,2)(4,1)(2,1) ===> output is  6
*/

class MergeSortArr{

	int MergeSort(int num[] , int start , int end , int mid , int temp[]){

	int i = start ,  count = 0 ;
	int j = mid , k= start;

	while((i <= mid-1) && (j <= end)){

		if(num[i] < num[j]){
			temp[k] = num[j];
		k++;
		j++;}
		else{

			temp[k] = num[i];

			count = count  + (mid - i );
			k++;i++;
		}
	}

	while(i <= mid-1)
		temp[k++] = num[i++];

	while(j <= end)
		temp[k++] = num[j++];

	for ( i  = start ; i < end ; i++) {
		num[i] = temp[i];
	}
	return count;
}

int MergeSort(int num[] , int start , int end , int temp[]){
	int mid = 0 , count = 0;
	if(start < end){
		mid = (start + end)/2;
		count = count+ MergeSort( num ,  start , mid -1 , temp );
		count = count + MergeSort(num , mid+1 , end , temp);

		count  = count + MergeSort(num , start , end , mid , temp);
	}
	return count;
}
	public static void main(String[] args) {
		
		int num[] = {8,4,2,1};
		int len = num.length-1;
		int temp[] = new int[num.length];
		MergeSortArr m = new MergeSortArr();
	int ans =m.MergeSort(num , 0 , len , temp);
	System.out.println(ans);
	}
}