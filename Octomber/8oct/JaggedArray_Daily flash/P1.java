import java.io.*;
class P1{

      public static void main(String[] args) throws IOException {
      	
      	     BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
           
            System.out.println("Enter Length");
            int l1 = Integer.parseInt( br.readLine());
              int l2 = Integer.parseInt( br.readLine());
                int l3 = Integer.parseInt( br.readLine());
      	     int num[][] = new int[3][];
      	     num[0] = new int[l1];
      	     num[1] = new int[l2];
      	     num[2] = new int[l3];


      	     for (int i = 0 ; i < num.length ; i++ ) {
      	     	
      	     	for (int j = 0 ; j < num[i].length ; j++ ) {
      	     		
      	     		System.out.print("Enter " + i + " row Elements = ");
      	     		num[i][j] = Integer.parseInt(br.readLine());
      	     	}

      	     }

            
            System.out.println("Entered Elements are = ");

      	     for (int i = 0 ; i < num.length ; i++ ) {
      	     	
      	     	for (int j = 0 ; j < num[i].length ; j++ ) {
      	     		
      	     		System.out.print( num[i][j] +" ");

      	     	}

      	     	System.out.println();

      	     }



      }
}