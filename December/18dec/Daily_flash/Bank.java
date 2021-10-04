abstract class Bank{

	abstract void getBalance();
}


class SBI extends Bank{

     int rs = 100;
	void getBalance(){

         System.out.println("Balance is" + rs);
	}
}


class HDFC extends Bank{

     int rs = 150;
	void getBalance(){

         System.out.println("Balance is" + rs);
	}
}


class AXIS extends Bank{

     int rs = 200;
	void getBalance(){

         System.out.println("Balance is" + rs);
	}
}

class Balance{

	public static void main(String[] args) {
		
		HDFC h = new HDFC();
		h.getBalance();

		AXIS a = new AXIS();
		a.getBalance();

		SBI s = new SBI();
		s.getBalance();
	}
}