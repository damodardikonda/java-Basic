class Employee{
	int empid = 10;
	String name ="AK";
     static String company="ABC";


    Employee(int empid, String name){

 		empid=empid;
 		name=name;
 		
 	}


    void display(){

    	System.out.println(empid+" "+name+" "+company);
    }

      public static void main(String[] args) {
      	
      	 Employee e1=new Employee(1,"Rushi");
      	 e1.display();
     
      	 Employee e2=new Employee(2,"Damu");
      	 e2.display();



	}


}