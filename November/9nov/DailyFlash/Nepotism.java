class Nepotism{

	String hero = "tiger shroff ";
	int total = 62;

	void dispActor(){

		System.out.println("Only 10 are good");
	}

	static void dispShroff(){

		System.out.println("tiger Shroff is an Faltu actor .......... He dont know real meaning of acting");
	}

	class Kapoor{

		String hero = "Rishi kapoor";

		int tot_movies = 72;

		void dispActor(){
            
            System.out.println("Rishi kapoor is best Actor");

		}

		class Ranbir{

			String hero = "Ranbir Kapoor";
			int noAffair =  7;

			void display(){

				System.out.println("One of best Actor of Nepotism");
			}

			void dispNepotism(){

				System.out.println(this.hero + " is an Best Product from Nepotism..");
				System.out.println("Ranbir has " + this.noAffair + " Affairs");
				System.out.println("Ranbir Kapoor is an father of " + Kapoor.this.hero );
				System.out.println("Rishi Kapoor act in " + Kapoor.this.tot_movies);
				Kapoor.this.dispActor();
				Nepotism.this.dispActor();
				Nepotism.this.dispShroff();
			}
		}
	}


	public static void main(String[] args) {

		Nepotism n = new Nepotism();
		Nepotism.Kapoor k = n.new Kapoor();
        Kapoor.Ranbir r = k.new Ranbir();

        r.display();
        r.dispNepotism();

		new Nepotism().new Kapoor().new Ranbir().display();

		new Nepotism().new Kapoor().new Ranbir().dispNepotism();

	}
}