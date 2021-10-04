class Person{

	String name = "Damodar";

	void personName(){

		System.out.println("Person name is = " + name);
	}
}

class Job{

	String role = "Developer";
	double salary = 200000.00;
	int id = 2;

	Person p = new Person();

	void personDetails(){

		p.personName();
		System.out.println("Person role is = " + role);
		System.out.println("Salary is = " + salary);
		System.out.println("id is = " + id);
	}


	public static void main(String[] args) {
		
		Job j = new Job();
		j.personDetails();
	}
}