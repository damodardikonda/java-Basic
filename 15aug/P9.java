/*

Write a java program to check if the taken number is palindrome or not.
Input: 121 (Take Hardcoded)
Output: 121 is a palindrome number

*/
class P9{

	public static void main(String[] args) {
 
       int num = 121;
       int abc =num;
       int temp = 0;
       int rem = 0;

       while(num != 0){

       	rem = (num % 10);
       	temp = temp*10 + (rem);
       	num = num / 10;
       }		

      if(temp == abc ){
                
                System.out.println(temp + " is palindrom number");
        }
        else
        	System.out.println(temp + " is not palindrom number");
	}

}