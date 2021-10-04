import java.io.*;
class P5{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

		int dd = Integer.parseInt(br.readLine());
		int mm =Integer.parseInt(br.readLine());
		int yyyy = Integer.parseInt(br.readLine());

            
       if ((mm == 1 || mm==3|| mm==5|| mm==7 ||mm == 8 || mm == 9|| mm==12) && (dd <=0 || dd >31 )){
 
            System.out.println(" invalid date");
       }

       else if( (mm == 4 || mm == 6 || mm == 10 || mm ==11) && (dd <=0 || dd >= 31)){
             
             System.out.println("Invalid date");
       }
       else if(yyyy < 0000 || yyyy > 8000 ){
       	     System.out.println("Invalid date");
       }
       else if( mm == 2 ){

             if( (yyyy % 4 == 0) && (dd >=28 ||dd <=0 )){
             	System.out.println("Invalid Date");
             }
       }
       else{
    
           	System.out.println("Valid date");

       }
        	

    }


}
       


	
