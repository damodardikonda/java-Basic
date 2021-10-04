class Test{

	public static void main(String[] args) {
		int A[] = {2,1,3,4,5};
		int max = A[0];
		int square = max* max;
		int num =0;
		for (int i = 1 ; i < A.length ; i++ ) {
			num = A[i] * A[i];

			if(num > square)
				square = num;
		}

		int result = square;
System.out.println(result);
	}
}