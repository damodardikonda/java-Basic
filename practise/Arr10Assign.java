//10. Deletion operation on Array: Deletion in the Middle.

class Arr10Assign{

	public static void main(String[] args) {
		
		

		int a[] = {1,2,3,4,5};

		int mid = 2;

		for (int i = mid+1 ; i < a.length ; i++ ) {
			
			a[i-1] =a[i]; 

		}
		a[a.length-1] = 0;
		System.out.println("After Deleting array : ");

		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}