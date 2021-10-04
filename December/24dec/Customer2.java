interface MumbaiMarket3{

	static void quality(){

		System.out.println(" BEST QUALITY");
	}

	void price();
}

class SunilShop3 implements MumbaiMarket3{

	public void price(){

		System.out.println(" 500 - 600 ");
		}
}

class TilakRoad3 implements MumbaiMarket3{

	public void price(){

		System.out.println(" 800 - 900 ");
	}
}

class Test3{

	public static void main(String[] args) {
		
		MumbaiMarket3 m = new SunilShop3();
		MumbaiMarket3.quality();
		m.price();

		MumbaiMarket3 mm = new TilakRoad3();
		MumbaiMarket3.quality();
		mm.price();
	}
}