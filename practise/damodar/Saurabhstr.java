import java.util.*;
class Saurabh{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();

		int x = Character.getNumericValue(str.charAt(0));//3
		int y = 0 ,z = 0;
         int count = 0 ;

         for (int i = 1 ; i < str.length() ; i++ ) {
         	
         	if (str.charAt(i) >= 48 && str.charAt(i) <= 57)

         	{	y = Character.getNumericValue( str.charAt(i));
         			z = i;
         			break;
         	}else 
         		count++;
         }
         int cn2= 0;


         for (int i = z+1 ; i < str.length() ; i++) {
         	
         	cn2++;
         }


         if(count == x && cn2 == y)
         	System.out.println("True");
         else
         	System.out.println("False");
	}
}