class India{

	int amnt = 600000;
}

class Rashiaa extends India{
	
	int rafel = 6;

	void Display(){

		System.out.println("Towords india");

	}

	int total = 0;

	void amount(){

                total = rafel * amnt;

				System.out.println("Total " + total);

	}
}



class Business{

	public static void main(String[] args) {
		

		Rashiaa obj = new Rashiaa();
		obj.Display();
		obj.amount();
	}
}