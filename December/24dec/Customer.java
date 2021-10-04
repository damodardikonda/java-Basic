interface MumbaiMarket{

	default void quality(){

		System.out.println(" BEST quality");
	}

	void price();
}

class SunilShop implements MumbaiMarket{

	public void price(){

		System.out.println(" 500 - 600 ");
	}
}

class TilakRoad implements MumbaiMarket{

	public void price(){

		System.out.println(" 800 - 900 ");
	}
}

class Test2{

	public static void main(String[] args) {
		
		MumbaiMarket m = new SunilShop();
		m.price();
		m.quality();

		MumbaiMarket m2 = new TilakRoad();
		m2.price();
		m2.quality();
	}
}