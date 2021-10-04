class CreditCard{
	

}
class DebitCard{


}

class Payment{

	void makePayment( String creditcard ){

		 System.out.println( " Credit Card Payment " );
	}

	void makePayment(int amount , String Debitcard){

		 System.out.println( " 300000 from Debitcard");
	}
}

class Demo{

	public static void main(String[] args) {
		
		Payment p = new Payment();
		p.makePayment(" CreditCard");
		p.makePayment(30000," Debitcard");

	}
}