interface Player{

	void playerInfo();
}

class Batsman{

	public static void main(String[] args) {
		
		Player obj = new Player(){

			public void playerInfo(){

				System.out.println(" Virat ");
			}
		};
		obj.playerInfo();
	}
}