class Company{
	
	String name = " Biencaps ";

	class Employee{

		String name = " Damodar Dikonda";
		float sal = 100000.34f;
		String designation = "Developer";

		void info(){

			System.out.println(" Company name is " + Company.this.name);

			System.out.println("Employee name is " + this.name);
			System.out.println("Employee salary is " + this.sal);
			System.out.println("Employee Designation is " + this.designation);
			
		}
	}
}

class CompEmpInfo{

	public static void main(String[] args) {
		
		Company c1 = new Company();

		Company.Employee e = c1 . new Employee();
		e.info();
	}
}