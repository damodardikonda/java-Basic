interface Player{

	void playerName();
}


class Batsman{

	public static void main(String[] args) {
		
		Player p = new Player(){

			public void playerName(){

				System.out.println(" Rishabh pant / Makbool");
			}
		};

		p.playerName();
	}
}