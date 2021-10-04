class Admission{

	Admission(String field ){

            if(field =="medical")
            	neet();
            else if (field == "Engineer")
            	jee();
	}

       
    void neet(){

    	class Government{

           void clg(){

           	System.out.println("AISSMS");
           }



    	}

         class Private(){

            void college(){

            	System.out.println("Bharti Vidyapeeth");
            }

         }


         Government g = new Government();
         g.clg();


         Private p = new Private();
         p.college();

    }



    void jee(){

    	class Government{

           void clg(){

           	System.out.println("COEP");
           }



    	}

         class Private(){

            void college(){

            	System.out.println("MIt");
            }

         }

             Government g = new Government();
         g.clg();


         Private p = new Private();
         p.college();
    }	

}


class Decision{

	public static void main(String[] args) {
		
		Admission a = new Admission("Medical");
		Admission a = new Admission("Engineer");
	}
}