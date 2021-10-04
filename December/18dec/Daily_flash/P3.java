abstract class AA{

   
     void non_abstract(){

     	  System.out.println(" This is normal method of abstract class");
     }

     abstract void a_method();
    
}


class A extends AA{

     
     void a_method(){

     	System.out.println(" This is Abstract method ");

     }


}


class Demo{

	public static void main(String[] args) {
		
		AA a = new A();
		a.non_abstract();
		a.a_method();
	}
}