interface A{

	void playerInfo();

}

class B {

	public static void main(String[] args) {
		
		A pi = new A (){
			public void playerInfo(){
	
			System.out.println(" Rishabh Pant ");
		}
	};

		pi.playerInfo();
	}
}