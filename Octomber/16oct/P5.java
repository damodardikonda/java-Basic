import java.util.Scanner;
class P5{
 
      static boolean isMonotonic(int arr[]){

      	if(arr.length==1)
      		return true;
      	int first = arr[0];
      	int last = arr[length-1];

      	if (last >= first) {
      		
      		   for (int i = 0 ; i < arr. length; i++ ) {
      		   	 
      		   	   if (arr[i] > arr[i+1]) {
      		   	   	 
      		   	   	 return false;
      		   	   
      		   	   }
      		   }
      	}

      	else{

      		for (int i = arr.length-1 ; i > 0 ; --i ) {
      			
      			if (arr[i] > arr[i-1]) {
      				
      				return false;
      			}
      		}
      	}

      	return true;
      }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int size = 6;

		int arr[] = new int[size];

		System.out.println("Enter elements af array");
 
          for (int i = 0 ; i < size ; i++ ) {
          	
          	   arr[i] = sc.nextInt();
          }
 

        if (isMonotonic(arr) == true) {
        	
        	System.out.println("The givenj array is Monotonic");
        }

        else{

        	System.out.println("The given array is not monotonic");
        }

	}
}