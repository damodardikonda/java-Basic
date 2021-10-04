class Student{

    void Student(){

    	System.out.println("College has 300 Student");
    }

    class CompDept{

    	void Student(){

    		System.out.println(" Drink Pyaychay ");
    	}
    }

    class ItComp{

    	void Student(){

    		System.out.println("Book lagli");
    		System.out.println(" Kuth jaych jevayla");
    	}
    }
}


 class Restaurant{

 	Restaurant(){

 		System.out.println("SUBU'S Apla Hotel");
 	}

     
 	class Food{

 		void menu(){

 			System.out.println(" Pizza , Burger , Chicken tikka  , chicken kolhapuri , pahadi kabab , afghanistan Kabab "); 
 				System.out.println("Chicken 65");
 		}
 	}
 	class Drink{

        
 		void drinkAvailable(){

 			System.out.println("1.Beer , 2.Vodka , 3.Rum , 4.Whiskey ");
 		}

 		void order(){

 			System.out.println( " Drink is Available");

 		}
 	}


 }



class Students{

	public static void main(String[] args) {
		
		Student s =  new Student();
		s.Student();

		Student.CompDept cd = s.new CompDept();
		cd.Student();
		Restaurant r = new Restaurant();
		Restaurant.Drink d = r.new Drink();
		d.drinkAvailable();
		d.order();

		Student.ItComp it = s.new ItComp();
		it.Student();
		Restaurant.Food f = r.new Food();
		f.menu();
	}
}