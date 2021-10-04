import java.util.*;

class BUbble_Sort{

	void setting(int arr[]){

		for (int i = 0 ; i < arr.length-1 ; i++ ) {
			
			for (int j = 0; j < arr.length-1-i ; j++ ) {
					int temp =0;
					if(arr[j] > arr[j+1]){

                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
					}
			}
		}

		System.out.println("Output is = ");
		for (int i = 0 ; i < arr.length;  i++) {
			
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner( System.in);

		System.out.println("Enter len = ");
		int len = sc.nextInt();

		int arr[] = new int[len];
		System.out.println(" Length is = " +arr.length);
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		BUbble_Sort b = new BUbble_Sort();
		b.setting(arr);

	}
}