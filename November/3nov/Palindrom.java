import java.io.*;
class P3{


	void checkPalindrom(int arr[] , int n ){
        
        
         for (int i = 0 ; i < n ; i++) {
        	
        int temp = arr[i] ; //22
		int val = arr[i];   //22
       int rem ;
     int pal = 0;
      
		while(val != 0){
             
             rem = val  % 10 ; //2 
             pal = (pal*10) + rem; //2*10 = 20 +2 = 22;
             val = val /10;
		}
          if(temp == pal)
          	System.out.println("Value is Palindrom");
          else 
          	System.out.println("Not a palindrom");

          
	   }
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	
	System.out.println("Enter the Size of array");
	int n = Integer.parseInt(br.readLine());
    int nn = 1;

    int arr[] = new int[n];
    System.out.println("Enter the " + n + "numbers");
	for (int i = 0; i < n ; i++ ) {
		
		System.out.println("Enter the " + nn + " Location Number");
		arr[i] = Integer.parseInt(br.readLine());
		nn++;
	}

     P3 obj = new P3();
	obj.checkPalindrom(arr , n);

    }
}