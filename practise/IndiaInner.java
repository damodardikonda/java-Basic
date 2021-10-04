class India{

	India(){

		System.out.println(" india Country");
	}
		class Army{

		Army(){
			String s = "Damodar";
			int a=2147483640;
			int aa = 28000;
			float ff = 56.45f;
			boolean b = true;
			double d = 65.45;
			short ss= 13;
			//byte b = 3;
			System.out.println("Indian Army");
		}

	}

	class Navy{

		Navy(){

			System.out.println(" IndianNavy ");
		}

		void attack(){

			System.out.println("Gazi Attack");
		}
	}

	public static void main(String[] args) {
		
		India i = new India();
		Army a = i.new Army();
		India.Army ia = i.new Army();
		new India().new Navy().attack();

		Navy n = new India().new Navy();
		n.attack(); 
	}
}