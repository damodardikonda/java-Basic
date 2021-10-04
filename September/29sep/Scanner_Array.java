import java.util.*;

class Scanner_Array{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Length of an array ");

		int x = sc.nextInt();

		int[] arr = new int[x];

		for (int i = 0 ; i < x ; i++ ) {
			
			System.out.println("Enter the "+ (]
				i+1) +"th number");
			arr[i] = sc.nextInt();
		}

		System.out.println("Entered List is ");

		for (int i = 0 ; i < x ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}