abstract class XX{

	int x = 20;
	static int y = 50;

}

class XXXX extends XX{

	public static void main(String[] args) {
		XX obj = new XXXX();
		obj.x = 2000;
		System.out.println(obj.x);
		System.out.println(XX.y);
	}
}