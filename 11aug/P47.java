/*
 * * * * * * *
     * * * * *
       * * * 
         *
*/

class P47{

	public static void main(String[] args) {
    for (int i= 5; i>=0 ; i--)
    {
        for (int j=5; j>=i; j--)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=(i*2); k++)

        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    
 
}
}