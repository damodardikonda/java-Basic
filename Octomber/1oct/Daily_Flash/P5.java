import java.util.*;

class P5{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Numbers");
		int n = sc.nextInt();

		int arr1[] = new int[n];
		int arr2[] = new int[n];

		for (int i = 0 ; i < arr1.length ; i++ ) {
			 
			 System.out.println("Enter values");
			 arr1[i] = sc.nextInt();
		}

        
		for (int j = 0 ; j < arr2.length ; j++ ) {
			
			arr2[j] = 0;
		}

         
		for (int i = 0 ; i < arr1.length ; i++ ) {
			 
		
				if(arr1[i] % 2 == 0){
                            
					arr2[i] = arr1[i];
		

			}
			
		}


		System.out.println(" First array is ");
 
        for (int i = 0 ; i < arr1.length ; i++ ) {
        	
        	System.out.println(arr1[i]);
        }

        System.out.println("Second Array is");
        for (int i = 0 ; i < arr2.length ; i++ ) {
        	 
        	 System.out.println(arr2[i]);
        }

	}
}