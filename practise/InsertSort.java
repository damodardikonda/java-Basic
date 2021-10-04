class InsertSort{
	
	public void insertSort(int a[]){

		for (int i = 1 ;i < a.length ; i++ ) {
			int temp = a[i];
			int j = i-1;

			while( j >= 0 && a[j] > temp ){

				a[j+1] = a[j];
				j--;
			}

			a[j+1] = temp;
		}	

		for (int i = 0 ; i < a.length ; i++) {
			
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		int a[] = {7,3,9,12,89};

		InsertSort is = new InsertSort();
		is.insertSort(a);
	}
}