
class Patient{

	public static void main(String[] args) {
		
		Hospital hp = new Hospital();
		hp.service();
	}
}
class Hospital{

    String hName = "K.E.M Hospital";
    int visDoc = 28;
    void hospInfo(){

    	System.out.println("Hospital name is = " + hName );
    	System.out.println("Visistors Doctor = " + visDoc);
    	service();
    }
    Doctor d = new Doctor();

	void service(){

		System.out.println("This is hospital");

		System.out.println("Doctor name is = " + d.name);
		System.out.println("Exprience of doctor = " + d.exp);
		d.operation();
	}
}

class Doctor{

	String name = "Damodar Dikonda";
	int exp = 4;

	void operation(){

		System.out.println("Neuro-Surgen");
	}
}
