
class Spy{
	
	public static void main(String[] args) {
		
		int num=1234;
		int ld,sum=0,mul=0;

		while(num!=0){
 
         ld=num%10;
         sum= sum+ld;
         mul= mul*ld;

         num=num/10;


		}
       	    	if(sum == mul){

       	    		System.out.println("It a spy Number");
       	    	}
       	    	else{
                      
                      System.out.println("It a not a spy Number");


       	    	}
       	    }

       }
          
		
       

	
