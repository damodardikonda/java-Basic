class BinarySearch{

	public void Searching( int a[] , int first , int last , int key){

		int mid = (first + last ) / 2;

		while( first <= last){

			if(a[mid] < key){
				last = mid-1;
			}

			else if(a[mid] == key){

				System.out.println( key + " Found at" + mid + " location . ");
			}

			else if(a[mid] > key){

				first = mid + 1;
			}
			mid = (first + last) / 2;
		}

		if(first >= last){

			System.out.println("Array chukicha ahe");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80};
		int key = 30;
		int last = arr.length-1;
	
		BinarySearch bs = new BinarySearch();
		bs.Searching(arr , 0 , last , key);
	}
}