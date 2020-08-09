class Football{



}


class Cric {
 

 public static void main(String[] args) {
 	
 
	Cric test = new Cric();
	Football f = new Football();

	System.out.println(test instanceof Object
	);// true

	//	System.out.println(Cric instanceof Football) //error 


	System.out.println( f instanceof Football);

   	System.out.println( f instanceof Object);


}

}