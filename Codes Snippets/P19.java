class P19{

	public static void main(String[] args) {
		
		int[] arr = {1 , 2 ,3};

        int arr2[] = arr;
        arr = new int[2];
		for (int i : arr) {
			
			System.out.println(i);
		}
	}
}