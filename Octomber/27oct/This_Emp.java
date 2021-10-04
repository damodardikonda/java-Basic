class Company{

	private String name = "Damodar";
	String CompName = "Microsoft";
	int age = 21;

	Company(){
    	System.out.println("Default Constructor");
    }


    Company(String name , int age){

    	this.name = name;
    	this.age = age;

    }


    void display(){

    	System.out.println("Company name is = " + CompName);
    	System.out.println("Name is = " + name);
    	System.out.println("Age is = " + age);
    } 
}

class Employ{

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
