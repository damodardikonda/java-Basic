class Employee{

	String empName = "Damodar Dikonda";

	double sal = 2000.56;
	void personInfo(){

		System.out.println("Person Name is = " + empName);
	}
}

class Job{

	String role = "Developer";
	int id = 28;

	Employee e = new Employee();

	void jobDes(){
		
		e.personInfo();
		System.out.println("Role is = " + role);
		System.out.println(" ID is = " + id);
		System.out.println(" Salaryt is = " + e.sal);
	}

	public static void main(String[] args) {
		
		Job j = new Job();
		j.jobDes();
	}
}