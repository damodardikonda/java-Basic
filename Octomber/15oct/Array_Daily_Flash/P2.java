import java.util.*;

class P2{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int row = sc.nextInt();
        int count = 0;
        int total = 0;
		int arr[] = new int[row];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.print("Enter the number = " );
			arr[i] = sc.nextInt();

		}

		for (int i = 0 ; i < arr.length ; i++ ) {
			 
			 for (int j = 1 ; j < arr.length ; j++ ) {
			 	
			 	if(arr[i] % 2 == 1){

                      if(arr[i] == arr[j]){
                      	count ++;
                      }
			 	}
                   if(total > count)
                   total = count;


			 }
		}

		System.out.println("Count is = " + count);
	}
}
