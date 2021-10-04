import java.io.*;
class Employee{

	String name ;
	String company;
	String id ;
	String nooOfYear;

	Employee(String name , String company , String id , String nooOfYear){

		this.name = name ;
		this.company = company;
		this.id = id ;
		this.nooOfYear = nooOfYear;

        System.out.println("name of Employee is = " + name);
         System.out.println("name of Company is = " + company);
          System.out.println("id of Employee is = " + id);
           System.out.println("No of years  of Employee is Working= " + nooOfYear);

	}
}

class mainDemo{

 	


 public static void main(String[] args) throws IOException {
 
  InputStreamReader isr = new InputStreamReader(System.in);
 	BufferedReader br = new BufferedReader (isr);

       
	
	
    String id ;
	String nooOfYear;

            
            	System.out.println("Enter the array size");
 
 	int n = Integer.parseInt(br.readLine());

 	String obj[] = new String[n];
   
 	for (int i = 0 ; i < n ; i++) {
 		
 		System.out.println("Enter the name of Employee");
        String name = br.readLine();

        System.out.println("Enter the company name");
        String company = br.readLine();

        System.out.println("Enter the id ");
        id =(br.readLine());

        System.out.println("Enter Workinng Year");
        nooOfYear = (br.readLine());

        String arr[] = {name , company ,id , nooOfYear};

        Employee emp = new Employee(arr[0] , arr[1] , arr[2], arr[3]);

 	}
 }
}