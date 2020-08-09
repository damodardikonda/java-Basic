/* 

   Write a Java Program with a class of name dominos with two instance
   variable 'price' and 'quantity', declare one static variable named 'total' and static
    method bill() . Create two objects of class named as pizza and fires assign some value
    for instance variable of class and calculate the total bill & print the total cost.

    */



class Dominos{
	
	int price=320;
	int quantity=5;

	static int total=800;

    void b(){
    	System.out.println("Price="+price);
    	System.out.println("Quantity="+quantity);


    }
	static void bill(int price, int quantity){
            total=price+quantity;
	      System.out.println("Total bill is = "+total);

	}
}


class Bills{
	public static void main(String[] args) {


		Dominos pizza =new Dominos();
		pizza.price=180;
		pizza.quantity=2;
		pizza.b();
		pizza.bill(pizza.price,pizza.quantity);

		Dominos fries =new Dominos();
		fries.price=120;
		fries.quantity=3;
		fries.b();
		fries.bill(fries.price,fries.quantity);



	}

}