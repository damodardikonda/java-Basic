
import java.io.*;

class ReverseSwitch{

	public static void main(String[] args) {
        
        int num = 0;
        try{

			BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		 num = Integer.parseInt(br.readLine());
           } catch(IOException e){

           	        System.out.println("Throws IOException");
           }


           int rem = 0;

           while(num != 0){

           	      rem = rem * 10 + (num % 10 );  //2446 %10 = 6;
           	      num = num /10;
           }


           int temp = rem ;

           while(temp != 0 ){

           	    int a = temp % 10;

           	    switch(a){

           	    	case 1:
           	    		System.out.print("one ");
           	    		break;



           	    	case 2:
           	    		System.out.print("Two ");
           	    		break;

           	    	case 3:
           	    		System.out.print("Three ");
           	    		break;

           	    	case 4:
           	    		System.out.print("Four ");
           	    		break;

           	    	case 5:
           	    		System.out.print("Five ");
           	    		break;

           	    	case 6:
           	    		System.out.print("Six ");
           	    		break;

           	    	case 7:
           	    		System.out.print("Seven ");
           	    		break;
           	    }

           	    temp = temp/10;

           }

	}
}