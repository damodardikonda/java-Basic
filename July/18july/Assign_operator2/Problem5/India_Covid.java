/*Program 5: Write 2 classes as Pune, Mumbai. Add the following things:
class Pune :
static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown
noLockdown
class Mumbai :
static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown
noLockdown
Increment both the variables in non-static method. Call non-static methods twice,
display the output and observe the changes. Draw JVM architecture for the same

*/

class Pune{
	
	static int covidActiveCases=293000;
	 int totalCases=28142;

	 static void noCorona(){
	     
	     System.out.println("Total Active Cases in Maharastra= "+covidActiveCases);

	 }

    void lockdown(){

       	     System.out.println("Total Active Cases in Pune= "+totalCases);
       	     System.out.println("Total Active Cases in Pune= "+   ++totalCases);
       	     System.out.println("Total Active Cases in Pune= "  ++totalCases);
       	    System.out.println(" Lockdown is Required ");

    }
    void noLockdown(){

	        System.out.println("Total Active Cases in Pune= "+totalCases);
       	    System.out.println(" Lockdown is not Required ");

    }
}




class Mumbai{
	
	static int covidActiveCases=293000;
	 int totalCases=123377;

	 static void noCorona(){
	     
	     System.out.println("Total Active Cases in Maharastra= "+covidActiveCases);

	 }


    void lockdown(){

       	     System.out.println("Total Active Cases in Mumbai= "+totalCases);
       	     System.out.println("Total Active Cases in Mumbai= "+ ++totalCases);
       	    System.out.println(" Lockdown is Required ");

    }
    void noLockdown(){

    	    System.out.println("Total Active Cases in Mumbai= "+totalCases);
       	    System.out.println(" Lockdown is not Required ");

    }
}


class India_Covid{
	public static void main(String[] args) {
		
		Pune p =new Pune();
		p.totalCases++;
		p.lockdown();
		p.noLockdown();
        
        Mumbai m =new Mumbai();
		m.totalCases++;
		m.lockdown();
		m.noLockdown();


	}
}