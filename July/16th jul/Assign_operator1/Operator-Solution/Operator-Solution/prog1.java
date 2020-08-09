
class Dominos{

	int price;
	int quantity;
	static int total = 0;

	static void bill(){
	
		System.out.println("Total Bill = " + total);
	}

	public static void main(String []args){
	
		Dominos pizza = new Dominos();
		pizza.price = 200;
		pizza.quantity = 2;
		Dominos.total = total + pizza.price * pizza.quantity;

		Dominos fries = new Dominos();
		fries.price = 50;
		fries.quantity = 2;
		Dominos.total = total + fries.price * fries.quantity;
		
		Dominos.bill();
	
	}
}
