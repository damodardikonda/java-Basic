class Raja{

	public static int test(int[] nums ){

		int finalcount = nums.length/2;

			for (int num : nums ) {
				
				int count = 0;

				for (int ele : nums ) {
					
					if(ele == num){

						count+=1;
					}
				}

				if(count>finalcount){

					System.out.println(num);
				}
			}

				return -1;

	}
	public static void main(String[] args) {

			int nums[] = {2,2,1,1,1,2,2,1,2,1};
				int x = test(nums);
						System.out.println(x);	
	}
}
