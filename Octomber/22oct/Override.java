class Pappa{

	void getProperty(){

		System.out.println("Punyat Banglow Asava");
	}

	void Career(){

		System.out.println(" Cricketer");
	}

	void marry(){

		System.out.println(" Scarlette Johnson");	
	} 
}


class Dams extends Pappa{

	void getProperty(){

		System.out.println("Punyat Banglow Asava");
	}

	void Career(){

		System.out.println(" Engineering ");
	}

	void marry(){

		System.out.println(" Kriti Sanon");	
	} 
}


class Bhenchod_Kaka{

	public static void main(String[] args) {
		
		Pappa p  = new Pappa();
		p.getProperty();
		p.Career();
		p.marry();

		 Dams d  = new Dams();
		d.getProperty();
		d.Career();
		d.marry();  

        Pappa p1  = new Dams();
		p1.getProperty();
		p1.Career();
		p1.marry();

/*

Punyat Banglow Asava
 Cricketer
 Scarlette Johnson
Punyat Banglow Asava
 Engineering
 Kriti Sanon
Punyat Banglow Asava
 Engineering
 Kriti Sanon
 */

       //Dams d1  = new Pappa(); // error ==  incompatible types: Pappa cannot be converted to Dams
		/*d1.getProperty();
		d1.Career();
		d1.marry();
*/
	}
}