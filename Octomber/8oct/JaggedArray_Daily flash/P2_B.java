class P2B{

	public static void main(String[] args) {
		
		int num[][] = {

		        new int[]{1},
		        new int[]{2,3},
			    new int[]{4,5,6},
			    new int[]{7,8,9,10}

         };
			for (int i = 0 ; i < num.length ; i++ ) {
				
				for (int j = 0 ; j < num[i].length ; j++ ) {
					
					System.out.print(num[i][j] + " ");
				}

				System.out.println();
			}

		}
	}
