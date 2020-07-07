
import java.lang.*;

class SizeDemo{

    public static void main(String[] args) {

    	//Integer is an Wrapper Class and SIZE is Its Static Variable. so these syntax is 'Classname.variable' nothing else
   	  
   	  System.out.println("The size of integer datatypes in bits="+Integer.SIZE);
   	  System.out.println("The size of integer datatypes in bytes="+(Integer.SIZE)/8);
   	  

   	  System.out.println("The size of Short datatypes in bits="+Short.SIZE);
   	  System.out.println("The size of Short datatypes in bytes="+(Short.SIZE)/8);

   	  System.out.println("The size of Long datatypes in bits="+Long.SIZE);
   	  System.out.println("The size of Long datatypes in bytes="+(Long.SIZE)/8);

   	  System.out.println("The size of Float datatypes in bits="+Float.SIZE);
   	  System.out.println("The size of Float datatypes in bytes="+(Float.SIZE)/8);

   	  System.out.println("The size of Double datatypes in bits="+Double.SIZE);
   	  System.out.println("The size of Double datatypes in bytes="+(Double.SIZE)/8);

   	  System.out.println("The size of Character datatypes in bits="+Character.SIZE);
   	  System.out.println("The size of Character datatypes in bytes="+(Character.SIZE)/8);

   	  System.out.println("The size of Byte datatypes in bits="+Byte.SIZE);
   	  System.out.println("The size of Byte datatypes in bytes="+(Byte.SIZE)/8);

   	  System.out.println("The size of Boolean is JVM Dependent");

   }

}