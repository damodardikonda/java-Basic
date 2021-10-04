interface Plan{

	default void trip(){

		System.out.println("Goa Trip");
	}

	static void Xyz(){

		System.out.println("Lawdya  ======");
	}
}
/*
class TripChange{

	public static void main(String[] args) {
		
		Plan p = new Plan(){

			public void trip(){

				System.out.println("Alibaug");
			}

			public void Xyz(){

				System.out.println("Zatyyaaa");
			}
		};

		p.trip();

		new TripChange$1() .Xyz();
	}
}*/

class XXX implements Plan{

	static void Xyz(){

		System.out.println("Bullu");
	}
	public static void main(String[] args) {
		
		XXX.Xyz();
	}
}