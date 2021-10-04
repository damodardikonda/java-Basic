import java.util.Scanner;

class P5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		
		
		

		System.out.println(" Enter the Year ");
        int year = sc.nextInt();

        if(year>2020){

          System.out.println(" Entered is wrong "); 
        }
        else{

        	System.out.println(" Enter the month ");
        	int month = sc.nextInt();
            
            System.out.println(" Enter the day ");
            int day = sc.nextInt();


            if((month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11 || month == 12) && (day <= 31)){

            	

            		System.out.println("valid ");
            	}
            	else if (( month == 4 || month == 6 || month == 8 || month ==10) && (day <= 30)){

            		

                         System.out.println("valid ");
             
            		}else if(( month == 2) &&(day <=28)){

            			System.out.println("valid ");
           
            		}
            	
            
        }
	
}
}
