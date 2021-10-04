/*Write a Program that accepts Two integers from user and prints
minimum number from them.
Input: 56 99
Output: The Minimum number amongst 56 & 99 is 56
*/
import java.io.*;
class P2{
      
      public static void main(String[] args) throws IOException{
      	
          InputStreamReader isr = new InputStreamReader(System.in);

          BufferedReader br = new BufferedReader(isr);

          int min = Integer.parseInt(br.readLine());
    
          int max = Integer.parseInt(br.readLine());

          if(min > max){

          	System.out.println(" The Minimum number amongst 56 & 99 is "+max);
          }
          else

          	System.out.println(" The Minimum number amongst 56 & 99 is " + min);
    
      }
	}