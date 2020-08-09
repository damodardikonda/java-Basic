package practise.com;

public class India{
	
	public int visit_cities=28;
	private string name="P_Modi";
	default int r_khasdar=39;
	protected string c_name="Rupees"; 


	public void display_tourist(){

		System.out.println("Visited cities for Tourist is " + visit_cities);

	}

     void politics(){

     	System.out.println("No of Rajyasabha Khasdar is " + r_khasdar);

     }

    protected void currentcy(){
      
      System.out.println("Indian currency is " + c_name);


     }
}



private class PKMKB extends India{

  public static void main(String[] args) {
  	
  	public int tererist_cities=22;
	private string Cname="Imran_Khan";
	default float garibi=80.20f;
	protected string border="Wagha"; 


	public void display_terrerist(){

		System.out.println("Visited cities for Tourist is " + tererist_cities);

	}

     void politics(){

     	System.out.println("Name Of Chutya PM is " + Cname);

     }

    protected void Disp_Border(){
      
      System.out.println("Indian currency is " + border);




       India great =new India();
       great.r_khasdar=42;
       great.c_name="Rs"

       great.display_tourist();
       great.politics();
       great.currentcy();
     }
  }

}