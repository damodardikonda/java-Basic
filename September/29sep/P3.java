class P3{
	
	public static void main(String[] args) {
		
		float[] arr = new float[5];
        float avg =0 , sum = 0;
		arr[0] = 23.56f;
		arr[1] = 90.34f;
		arr[2] = 67.34f;
		arr[3] = 41.90f;
		arr[4] = 5.34f;

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			sum = sum +arr[i];
			}

			avg = sum /arr.length;

			System.out.println("Average is =  " + avg );
		}
	}
