class ShoppingMall{

	void has(){

		System.out.println("Has 1 theater and 1 education University");
	}
}

class Theater extends ShoppingMall{

	void has(){

		System.out.println(" has 2 movies");
	}
}

class Education extends ShoppingMall{

	void has(){

		System.out.println(" has many students");
	}
}

class People{

	public static void main(String[] args) {
		
		ShoppingMall s = new ShoppingMall();
		s.has();

		Theater t = new Theater();
		t.has();
		ShoppingMall st = new Theater();
		st.has();

        Education e = new Education();
        e.has();
        ShoppingMall se = new Education();
        se.has();

	}
}