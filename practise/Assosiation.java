class Bank{

	String name = null;

	Bank(String name){

		this.name =name;
	}

	String dispName(){

		return name;
	}
}

class Employee{

	String name = "";

	Employee(String name){

		this.name =name; 
	}

	String dispName(){

		return name;
	}
}

class Assosiation{

	public static void main(String[] args) {
		
		Bank b = new Bank("Axis");
		Employee e = new Employee(" Damodar");

		System.out.println(" Bank Name is " + b.dispName() + " Employee name is " + e.dispName());
	}
}