
import java.io.*;

class CondeNast{

	public static void main(String[] args) throws IOException{
		
         BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the Size of the Array");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
        int arr2[] = new int[size];
		for (int i = 0 ; i < size  ; i++ ) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Entered Array is : ");

		for (int i = 0 ; i < size  ; i++ ) {
			
			System.out.println(arr[i]);
		}

		int sum = 10 ;
        int add = 0;
        int num1 = 0 , num2 =0 ;
       for (int i = 0 ; i < size-1 ; i++ ) {
			
			add = arr[i] + arr[i+1];

			if( sum == add){
                  num1 = arr[i];
                  num2 = arr[i+1];

                  for (int j = 0 ; j < size ; j++ ) {
                  	
                  	 if(arr2[j] != num1 ){

                  	 	arr2[j] = num1;
                  	 	
                  	 }


                  }
			}
		}

			System.out.println(" Array numbers whoes sum is " + sum + " : ");

		for (int i = 0 ; i < size  ; i++ ) {
			
			System.out.println(arr2[i]);
		}

	}
}