import java.io.*;

class Cake{

    class EGG{

        int egg;
    	EGG(int e){

    		egg = e;
    	}

    	EGG(){}

    }


    class Chocolate {

        int cho;
    	Chocolate(int choco){

    		cho = choco;
    	}
    }

    class Cream{

            int cr;

            Cream(int crr){

            	cr= crr;
            }
    }

 void disptotalCal(int eggCalory , int chocolateCal , int creamCal){

 	        int total ;
     
            EGG g = new EGG(eggCalory);
 	        Chocolate ccc = new Chocolate(chocolateCal);
            Cream cre = new Cream(creamCal);
        	
        	total = g.egg + ccc.cho + cre.cr;
 	        System.out.println(total);
 }
    

    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

    	System.out.println("Enter calories present in egg");
    	int eggCalory = 72;

        System.out.println("Enter calories present in Chocolate");
    	int chocolateCal = 72;

        System.out.println("Enter calories present in egg");
    	int creamCal = 72;

       Cake c = new Cake();
       EGG e = c.new EGG(eggCalory);
       Chocolate ch = c.new Chocolate(chocolateCal);
       Cream cr  = c.new Cream(creamCal);

       c.disptotalCal(eggCalory , chocolateCal , creamCal);
    }

}