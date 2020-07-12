class Hindustani_Bhau{
	
   static int post=200;
   int gaali=10;

   void shivya(){
   	System.out.println("Sarvach detat");
   	System.out.println(gaali);
   }

   static void insta(){
   	     	System.out.println("Posts"+post);

   }


}


class DeshPremi{
	public static void main(String[] a){
         Hindustani_Bhau bhau = new Hindustani_Bhau();
         bhau.shivya();
         bhau.gaali=20;
         Hindustani_Bhau.insta();
         Hindustani_Bhau.post=150;
         insta();

	}
}