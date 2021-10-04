class Grandpa{
	
	void marry(){

	     System.out.println("Decision");
	}
}

abstract class Parent extends Grandpa{

	abstract void marry();
}

class Son extends Parent{

	void marry(){

		System.out.println(" Kriti Sanon ");
	}
}

class Life{

	public static void main(String[] args) {
		
		Son s = new Son();
		s.marry();
	}
}