class IndianDefence{

	IndianDefence(){

		System.out.println("Major General Bipin Shah");
	}


	class Army{

		void Attack(){
			System.out.println("URI Attack");
		}
	}

	class Navy{

		void Attack(){

			System.out.println("Gazi Attack");
		}
	}

	class AirForce{

		void Attack(){

			System.out.println("Balakot Attack");
		}
	}


	public static void main(String[] args) {
		
		IndianDefence india = new IndianDefence();
		Army army =india.new Army();
        army.Attack();
		
		Navy navy = india.new Navy();
		navy.Attack();

        AirForce air = india.new AirForce();
        air.Attack();
	}
}