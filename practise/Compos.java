class Mall{

	String name = "Kumar Pacific";
	int numShops  = 30;

	Zara z = new Zara();

	void Shopping(){

		System.out.println(" Want to take t shirt from Kumar pacififc mall");
		System.out.println("It has " + numShops +" Shops");
		z.tShirt();
	}
}

class Zara{

	void tShirt(){

		System.out.println("Full Sleeves / Half sleeves ");
	}


}

class Customer{
public static void main(String[] args) {

    Mall m = new Mall();	
    m.Shopping();

}
}