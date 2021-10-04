class Mulga{

    String name = "Babdya";
   static int paisa = 10;

	void economical(){

		System.out.println("Babdya===> I am Poor");
		System.out.println("Babdya kade " + paisa +" paise ahet");
	}

	static class Mulgi{

        String name2 = "BC Babdya2";
        int paisa2 = 100000;
		void knowCond(){
			System.out.println();
			System.out.println();

			System.out.println(" Nikita Babdya chi Economical Condition Kalalyavrr  Palun geli");
			System.out.println();
			System.out.println();

			System.out.println(name2 + " new BF");
			System.out.println(name2 + "Kade " + paisa2 + " ahe");
			System.out.println();
			System.out.println();


			System.out.println("Babdya kade " +paisa + " ahe");
			System.out.println("Babdya ch name yayla paise kamvave lagtil tyala mangach access hoil");
			System.out.println();
			System.out.println();

			Mulga rich = new Mulga();
			System.out.println(rich.name + " Paise kamavlyamule zala access" );
		}
	}

	public static void main(String[] args) {
		
		Mulga mm = new Mulga();
		mm.economical();
		Mulgi m =new Mulgi();
		m.knowCond();
	}
}