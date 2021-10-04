class ArrayTrial{

	public static void main(String[] args) {
		
		int a[] = {2,5,7,8,9};
        int add = 0;
		for (int i = 0 ; i < a.length-1 ; i++ ) {

				add = a[i] + a[i+1];
				System.out.println(add);
			}
		}
	}
