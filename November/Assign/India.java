class India{
	
	India(){

	      System.out.println(" India Best Country in World");
	}

	class Maharastra{

      Maharastra(){

      	    System.out.println("Maharastra is best State in india");
      }

      class City1{

      	   String c1 ;

      	   City1(String c1){

      	   	    this.c1 = c1;
      	   }

      	   void city1(){

      	   	    System.out.println("City name is " + c1);
      	   }
      }


       class City2{

      	   String c2 ;

      	   City2(String c2){

      	   	    this.c2 = c2;
      	   }

      	   void city2(){

      	   	    System.out.println("City name is " + c2);
      	   }
      }




	}

    
    class Rajasthan{

      Rajasthan(){

      	    System.out.println("Rajassthan has the Great India Desert");
      }

      class City1{

      	   String c1 ;

      	   City1(String c1){

      	   	    this.c1 = c1;
      	   }

      	   void city1(){

      	   	    System.out.println("City name is " + c1);
      	   }
      }


       class City2{

      	   String c2 ;

      	   City2(String c2){

      	   	    this.c2 = c2;
      	   }

      	   void city2(){

      	   	    System.out.println("City name is " + c2);
      	   }
      }




	}

	public static void main(String[] args) {
		
		new India().new Maharastra().new City1("Pune").city1();
		new India().new Maharastra().new City2(" Mumbai ").city2();


            India i = new India();
            Rajasthan r = i.new Rajasthan();
            Rajasthan.City1 c1 = r.new City1("Jaipur");
            c1.city1();
             Rajasthan.City2 c2 = r.new City2("Mewar");
             c2.city2();
	}
}