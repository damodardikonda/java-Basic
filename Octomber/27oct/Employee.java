class Company{

	private String name = "niket";
    private String companyname = "BMC Software";
    private int age = 28;

    Company(){
    	System.out.println("Default Constructor");
    }


    Company(String emp_name , int empage){

    	name = emp_name;
    	age = empage;

    }


    void display(){

    	System.out.println("Company name is = " + companyname);
    	System.out.println("Name is = " + name);
    	System.out.println("Age is = " + age);
    } 
}

class Employee{

	public static void main(String[] args) {
		
		Company niket = new Company();
		niket.display();
 
        Company tanma = new Company();
        Company tanmay = new Company("Tanmay" , 22);
		tanmay.display();

        Company ades = new Company();
        Company adesh = new Company("AAdesh" , 21);
		adesh.display();


	}
}