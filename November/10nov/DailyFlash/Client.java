 class Restaurant{

 	Restaurant(){

 		System.out.println("SUBU'S Apla Hotel");
 	}

 	class Drink{
        
        String alcohol = null;

        Drink(String alcohol){

        	this.alcohol = alcohol;
        }
 		void drinkAvailable(){

 			System.out.println("1.Beer , 2.Vodka , 3.Rum , 4.Whiskey ");
 		}

 		void order(){

 			System.out.println("3 "+alcohol + " is Available");
 			



 		}
 	}


 	class Food{

 		void menu(){

 			System.out.println(" Pizza , Burger , Chicken tikka  , chicken kolhapuri , pahadi kabab , afghanistan Kabab "); 
 				System.out.println("Chicken 65");
 		}
 	}
 }

class Bank{

	

	class BankHolder{
        int amnt = 800;
		String name = " Damodar Dikonda";
		int acc_no = 1234;
       

        void bill(){

        Restaurant r1 =new Restaurant();
         Restaurant.Drink d = r1.new Drink(" KingFisher Ultra Max");
		Restaurant.Food f = r1.new Food();
		f.menu();
	    d.drinkAvailable();
	    d.order();       
        }


        void paid(){
             System.out.println("Maharastra Bank");
        	System.out.println("800 rs is paid  by " +  acc_no + " name is " + name);
        }

	}


}

class Client{

	public static void main(String[] args) {
		
		
	    Bank b = new Bank();

	    Bank.BankHolder bh = b.new BankHolder();
        bh.bill();
        bh.paid();
		
		

	}
}