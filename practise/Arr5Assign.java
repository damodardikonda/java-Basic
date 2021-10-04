//5. Insertion operation on Array: Insertion at the Start
import java.util.*;
class Arr5Assign{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = 5;

		int arr[] = new int[len+1];

		for (int i = 0 ; i < arr.length-1 ; i++ ) {
			
			arr[i] = sc.nextInt();
		}

		for (int i = (len-1); i >= 0  ; i-- ) {
			
			arr[i+1] = arr[i];
		}
		System.out.println("Enter the num = " );
		arr[0] = sc.nextInt();


		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}