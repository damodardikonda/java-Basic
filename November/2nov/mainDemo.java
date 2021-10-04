import java.io.*;
class Employee{
	
	 String name;
	 String cname;
	 int id ;
	 int no_of_yr ;


      Employee(String name , String cname , int id , int no_of_yr){

            name = this.name;
            cname = this.cname;
            id = this.id;
            no_of_yr = this.no_of_yr;
      }
}


 class MainDemo{

		
		BufferedReader br  = new BufferedReader(new InputStreamReader (System.in));

       System.out.println("Enter the Employee numbers ");
       int n = br.readLine();

       int num = 1;
       String obj[]= new String[n-1];


	 String name;
	 String cname;
	 int id ;
	 int no_of_yr ;
     String o;


       for (int i = 0 ; i < obj.length ; i++ ) {
       	
           System.out.println("Enter  the details for Employee "  + num);
           System.out.println("Enter EmpName. = ");
           obj[i].name = br.read();
           System.out.println("Enter Company name = " );
           obj[i].cname = br.read();
           System.out.println("Enter Emp Id. = ");
           obj[i].id = br.readLine();
           System.out.println("Enter Working years in Company  = " );
           obj[i].no_of_yr = br.readLine();

         System.out.println("Enter Object name ");
        	o = br.read();	
          

       }

        
        public static void main(String[] args) throws IOException{
        	
        	for (int i = 0 ; i < obj.length ; i++ ) {
        		
                 Employee o = new Employee(obj[i]);
        	}
        }
}
