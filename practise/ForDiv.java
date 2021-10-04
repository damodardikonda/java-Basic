import java.io.*;

class ForDiv{
	
	public static void main(String[] args) throws IOException {
		
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter total");
      int total = Integer.parseInt(br.readLine());

      
      int arr[] = new int[total];

      for (int i = 0 ; i < total; i++) {
       
            System.out.println(i+"location");
            arr[i] = Integer.parseInt(br.readLine());	 

      }

      for (int i = 0 ; i < total ; i++ ) {
      	
      	 if(arr[i] % 5 ==0){

      	 	System.out.println(arr[i]);
      	 }
      }

	}

}