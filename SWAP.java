import java.util.Scanner; 
class SWAP
{
   public static void main(String args[])
    {
      int x,y;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the numbrs");
      x=sc.nextInt();
      y=sc.nextInt();
      
        /*x=10 y=20*/
        y=((x+y)-(x=y));
	System.out.println(x);
	System.out.println(y);
}
}