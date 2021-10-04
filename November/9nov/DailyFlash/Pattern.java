class Pattern{

    public static void main(String[] args) {
        
        for (int i = 1 ; i <= 5 ; i++ ) {
            
            for (int j = 5 - i; j >= 1 ; j-- ) {
                
                System.out.print(" ");
            }
             int num = 1;
            for (int k = 1 ; k <= i; k++ ) {
                
                if(num % 2 == 0)
                  System.out.print("0 ");
                else
                    System.out.print("1 ");
                num++;
            }

          System.out.println();

        }
    }
}