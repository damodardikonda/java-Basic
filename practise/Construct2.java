class BCCI{
	int a = 10;
	BCCI(){
	 int b = 20;
	 boolean bb = true;
		System.out.println(a );
		System.out.println(b);
		System.out.println(" In BCCI Constructor");
	}
}

class IPL extends BCCI{
	 String s = "Damo";

	IPL(){
		int xx = 1000;
		float ff= 10.0f;
		System.out.println(s);
		System.out.println(" In IPL Constructor");
	}


	public static void main(String[] args) {
		
		BCCI b = new BCCI();
		IPL i = new IPL();
	}
}