class Mouse{
	
	void Food_Mouse(){

       System.out.println("Eating Rice,wheat");
	}
}

class Cat extends Mouse{
	
	void Food_cat(){

	System.out.println(" Eating Mouse");

	}
}


class Dog extends Cat{
	
	void food(){

	System.out.println("Eating Cat");
	}
}

class Food_Circle{
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.food();
		d.Food_cat();
		d.Food_Mouse();

	}
}