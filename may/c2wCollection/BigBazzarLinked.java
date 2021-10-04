import java.util.*;

class BigBazaar{

	String prodName =null;
	float price = 0.0f;

	BigBazaar(String prodName , float price){

		this.prodName = prodName;
		this.price = price;
	}

	void disp(){

		System.out.print("product name : "+prodName);
		System.out.println(" Price : "+ price);
	}
	
}

class LinkedListM{

	public static void main(String[] args) {
		
		LinkedList ll =new LinkedList();
		ll.add(new BigBazaar("gahoo" , 46.00f));
		ll.add(new BigBazaar("tandiool" , 51.00f));
		ll.add(new BigBazaar("Jwari" , 64.00f));

		ListIterator list = ll.listIterator();

		while(list.hasNext()){

			BigBazaar obj = 	(BigBazaar)list.next();
			obj.disp();
		}
	}
}