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

 			System.out.println(alcohol + " is Available");

 		}
 	}


 	class Food{

 		void menu(){

 			System.out.println(" Pizza , Burger , Chicken tikka  , chicken kolhapuri , pahadi kabab , afghanistan Kabab "); 
 				System.out.println("Chicken 65");
 		}
 	}
 }



class Customer{

	public static void main(String[] args) {
		
		Restaurant r1 =new Restaurant();
	    Restaurant r2 =new Restaurant();
		
		Restaurant.Drink d = r1.new Drink(" KingFisher Ultra Max");

		Restaurant.Food f = r2.new Food();
		d.drinkAvailable();
		d.order();

		f.menu();
	}
}