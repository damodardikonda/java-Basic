/*Pattern44
        A
      B A B 
    C B A B C
  D C B A B C D
E D C B A B C D E
*/

class P44{

	public static void main(String[] args) {
		int ch = 64;
		int i,j,n=5;
		for(i=1;i<=n;i++)
     {
 
        for(j=1;j<=n-i;j++)
        	 {
     System.out.print("  ");
 } 
        for(j=i;j>0;j--)
         {
     System.out.print((char)(j+ch));
 } 
        for(j=2;j<=i;j++)
         {
     System.out.print((char)(j+ch));
 } 
 
         System.out.println();
     }
 }
}