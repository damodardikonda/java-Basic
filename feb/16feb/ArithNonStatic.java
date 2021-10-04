class ArNonStatic{

       ArithmeticException aa = new ArithmeticException(" Exception kadhaychay");

	public static void main(String[] args) {
		
		 ArNonStatic ar = new ArNonStatic();
		 throw ar.aa;
	}
}