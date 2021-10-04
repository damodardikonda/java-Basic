class BinarySearch{


	int searching(int a[] , int big , int end , int item){

		int mid = 0;

		if(end >= big){
			mid = (big+end/2);
			if(a[mid] == item)
				return mid+1;
			else if(a[mid] < item){

				return searching(a , mid+1,end, item);
			}else if(a[mid] > item){

				return searching(a , 0,mid-1,item);
			}
			else
				return -1;
		}

		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};

		int item = 2;
		int end = arr.length;
		BinarySearch b = new BinarySearch();
		int loc = b.searching(arr,0,end,item);

		if( loc == -1){

			System.out.println("Element is not present");
		}else
			System.out.println("Element present at " + loc  + " location " ); 
	}
}