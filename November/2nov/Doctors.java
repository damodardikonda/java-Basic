class Doctor{

	String dname = "MK Shah";
	int noHospVisit = 7;

	void operation(){

		System.out.println("Neuro-Surgen ");
	}
}

class Hospital{

	String  hname = "Sancheti";
	int totDoctors = 94;

    Doctor d = new Doctor();
	void service(){
        System.out.println("Hospital name = " +  hname);
        System.out.println( " otal Doctors are = " + totDoctors);
		System.out.println("  Good Service");

		visitor();
	}

	void visitor(){

		System.out.println(" he is visitor doctor");
		d.operation();
	}
}

class Patient{

	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		h.service();
	}
}