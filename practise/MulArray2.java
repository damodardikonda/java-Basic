class MulArray2 {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        System.out.println(" Length of Row 0 : "+a[0].length);
        System.out.println(" Length of Row 1 : " + a[1].length );
        System.out.println("Len of row 2 :  " + a[2].length);

        for (int i = 0 ; i < a.length ; i++ ) {
            
            for (int j = 0 ; j < a[i].length ; j++ ) {
                
                System.out.print(a[i][j] + " ");
            }

            System.out.println();



        }


            int aa[][] = {{1,2,3},{3},{6}};


        for (int i = 0 ; i < aa.length ; i++ ) {
            
            for (int j = 0 ; j < aa.length ; j++ ) {
                
                System.out.print(aa[i][j] + " ");
            }

            System.out.println();
        }

        int b[][] = new int[3][3];


    }
}