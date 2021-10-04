abstract class AbstractDemo{
	
	void getProperty(){

		System.out.println(" Property tr pahije bhava");
	}

	abstract void Career();
}

class AbstractHandle extends AbstractDemo{

	 void Career(){

			System.out.println("Career Banla");
		}
	public static void main(String[] args) {

		AbstractHandle h = new AbstractHandle();
		h.getProperty();
		h.Career();
	}
}