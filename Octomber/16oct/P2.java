import java.util.*;
class P2{

    
		static int OddNumber(int arr[] , int size){

			int i ;
			for (i = 0 ; i < size ; i++ ) {
				int count = 0;
				
				for (int j = 0 ; j < size ; j++ ) {
					
					if (arr[i] == arr[j] ) {
						
						count++;
					}

				}

				if(count % 2 != 0){

						return arr[i]; 
					}
					
			}

			return -1;
		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0 ; i < size ; i++ ) {
			
			System.out.print(" Enter Elements = " );
			arr[i] = sc.nextInt();
		}

		System.out.println(OddNumber(arr , size));

	}
}