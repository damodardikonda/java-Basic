class IPL{

	private String name = "KLRahul";
	private int runs = 578;

	IPL(){
 
		System.out.println("No arguments");
        
        System.out.println(this.name);
	}

	IPL(String name , int runs){

		System.out.println("Parameterised Constructor");
		this.name = name ;
		this.runs = runs ;

	}

	void Display(){
        System.out.println(this.runs);
		System.out.println("Name is = " + name);
        System.out.println("Runs are = " + runs);
		}
	}	

class IPL2020{

	public static void main(String[] args) {
		
		IPL obj = new IPL();
		obj.Display();

		IPL obj2 = new IPL("Mayank " , 550);
		obj2.Display();
	}
}