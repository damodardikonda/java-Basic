class Patt6{

	public static void main(String[] args) {
		 for (int i = 5-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
      
    }
}
			