abstract class Baba{

	void getProperty(){

		System.out.println(" Mensions..........");
	}

	abstract void marry();
}

class Child extends Baba{

	void marry(){

		System.out.println("Kriti Sanon");
	}
}

class Demo{

	public static void main(String[] args) {
		 //Baba b = new Baba();
	
	     Child c= new Child();
	     c.getProperty();
	     c.marry();


	     Baba c1= new Child();
	     c1.getProperty();
	     c1.marry();

	}
}