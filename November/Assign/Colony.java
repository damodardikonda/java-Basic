
class Colony{
	
	public static void main(String[] args) {
		
		Colony c[] = new Colony[5];

		for (int i = 0 ; i < 5; i++) {
			
			c[i] = new Colony();

			System.out.println("Address of "+ i + " location  Ants is "+c[i]);

		}
	}
}