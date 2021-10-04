class P1{
		
		String name = " Damodar";
		int marks = 500;

       P1(){

       	    System.out.println("IN Default Constructor");
       }


       void display(){

       	     System.out.println("String name is = " + name);
       	     System.out.println("Marks are = " + marks);
       }

      
	public static void main(String[] args) {

           P1 obj = new P1();
           obj.display();
	}
}