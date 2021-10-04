class IPLL{

	private String playername = "KLRahul";
	private int jersyno = 22;

	IPLL(){

		System.out.println(" Default Constructor");
	}


	IPLL( String playername , int jersyno){

		this.playername = playername;
		this.jersyno = jersyno;
	}

	void display(){

		System.out.println("Player name is = " + playername);
		System.out.println(" Player jersey no is = " + jersyno);
	}
}


class IPL2020{

	public static void main(String[] args) {
		
		IPLL i = new IPLL();

		IPLL i2 = new IPLL("Dhoni" , 7);
		i2.display();
	}
}