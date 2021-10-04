//4. Insertion operation on Array: Insertion at the end.

import java.util.*;
class Arr4Assign{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[6];
		System.out.println(arr.length);

		for (int i = 0 ; i < arr.length-1 ; i++ ) {
			
			arr[i] = sc.nextInt();
			System.out.println(i);
		}

		System.out.println("Enter val you want to insert ");
		int num = sc.nextInt();

		arr[arr.length-1] = num;

		System.out.println("Array is = ");
		for (int i = 0; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}