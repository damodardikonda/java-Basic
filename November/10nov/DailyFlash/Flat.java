class Flat {

	void flat(){
		System.out.println("this is my Flat");
	}

	class Kitchen{

		void kitchen(){

			System.out.println(" In Kitchen i am Searching for food");
		}
	}


	class BedRoom{

		void bedRoom(){

			System.out.println(" Best place to eat");
		}
	}


}

class Flat2{

	void dispFlat(){

		Flat f = new Flat();
		f.flat();

		Flat.Kitchen k = f.new Kitchen();
		k.kitchen();
        
       Flat.BedRoom b = f.new BedRoom();
       b.bedRoom();

	}

	public static void main(String[] args) {
		
		Flat2 f2=  new Flat2();
		f2.dispFlat();
	}
}