/*

 5: Write a Program that accepts Three integers from user and prints
maximum number from them.
Input: 56 7 99
Output: The Maximum number amongst 56 7 & 99 is 99

*/
import java.io.*;
class P5{

		

       public static void main(String[] args) throws IOException{
      	
          InputStreamReader isr = new InputStreamReader(System.in);

          BufferedReader br = new BufferedReader(isr);

          int min = Integer.parseInt(br.readLine());
    
          int max = Integer.parseInt(br.readLine());

          if(min < max){

          	System.out.println(" The Maximum number amongst 56 & 99 is "+max);
          }
          else

          	System.out.println(" The Maximum number amongst 56 & 99 is " + min);
    
      }		
	}
