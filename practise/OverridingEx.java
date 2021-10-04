class Dad{

	void getProperty(){

		System.out.println("Property pahije");
	}

	void Career(){

		System.out.println("Cricketer Honar");
	}
}

class Son extends Dad{


	void getProperty(){

		System.out.println("Property pahije");
	}

	void Career(){

		System.out.println(" Engineer Honar");
	}

	void Car(){

		System.out.println(" Kamit Kami 2 pahije");
	}
}

class Kaka{

	public static void main(String[] args) {
		
		Dad d = new Dad();
		d.getProperty();
		d.Career(); 
	
		Son s = new Son();
		s.getProperty();
		s.Career();
		s.Car();

		Dad d1 = new Son();
		d1.getProperty();
		d1.Career();
		//d1.gf(); 
	}
}