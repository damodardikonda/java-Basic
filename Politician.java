class Curruption{
	
	int paisa = 1000000;
}

class Rajneeti extends Curruption{

    String neta = new String("Kutbaji"); 	

}


class Politician {
	
	public static void main(String[] args) {
		
		Rajneeti rakt = new Rajneeti();

		System.out.println("Paisa khaa nusta " + rakt.paisa);

		System.out.println("Politics " + rakt.neta);


	}
}
