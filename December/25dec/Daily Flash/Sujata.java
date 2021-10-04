interface SujataMastani{
	
	default void quality(){

		System.out.println("Quality 1 number");
	}

	void price();
}

class Mumbai implements SujataMastani{

	public void price(){

		System.out.println("105");
	}
}

class Test{

	public static void main(String[] args) {
		
		Mumbai m = new Mumbai();
		m.price();
	}
}