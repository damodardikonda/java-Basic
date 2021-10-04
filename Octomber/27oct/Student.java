class CompEngg{

	String name = "Niket" ;
	int age = 22 ;

	CompEngg(){

		System.out.println("In COnstructor");
	}

	void display(){

		System.out.println("Name is  =  " + name);

		System.out.println(" Age is  =  " + age);
	}
}

class Student{

	public static void main(String[] args) {
		
		CompEngg niket = new CompEngg();
		niket.display(); //niket 22



		CompEngg adesh = new CompEngg();
		adesh.display(); //niket 22

		System.out.println("Changing value is ");
		adesh . name = " AAdesh";
		adesh.age = 23;

		adesh.display();// AAdesh 23
	}
}