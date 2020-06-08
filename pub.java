class Priv{
	
	private int a=10;

	private void meth(){

	System.out.println(a);
	}
    
    void meth1(){
     System.out.println("heyyy");
     System.out.println(a);    }
}


class pub{
	public static void main(String []args){
	Priv p =new Priv();
	//systm.out.println(p.a); it is not accessibe
	//p.meth(); not accesible private variable
	p.meth1();
	}
}