class P46{

	public static void main(String[] args) {
		int ch = 64;
		int i,j,n=5;
		for(i=1;i<=n;i++)
     {
 
        for(j=1;j<=n-i;j++)
         {
     System.out.print(" ");
 } 
        for(j=1;j<=i;j++)
         {
     System.out.print((char)(j+64));
 } 
        for(j=i-1;j>=1;j--)
         {
     System.out.print((char)(j+64));
 } 
 
         System.out.println();
     }
 }
}