class Mall{

	void m1(){

		System.out.println(" Nuste Firne");
	}

	class Food{

		void food(){

			System.out.println(" 29 Dukan ahe");
			System.out.println(" Sagla milel Paisa pahije");
		}
	}

	class Shopping{

		void shop(){

			System.out.println("43 dukan ahe");
			System.out.println(" Zara , Gucci , LP , SL");
		}
	}
}

class Kharidi{

	public static void main(String[] args) {
		
		Mall m = new Mall();
		m.m1();

		Mall.Food f = m.new Food();
		f.food();

		Mall.Shopping s = m.new Shopping();
		s.shop();
	}
}