class TappingWater{

	static int storedWater(int height[]){

		int l = 0 , leftmax = 0 ;
		int r = height.length-1, rightmax  = 0 , res =0;

		while(l <= r){

			if(height[l] <= height[r]){

				if(height[l] >= leftmax){

					leftmax = height[l];
				}else{

					res = res +leftmax - height[l];
				}
				//System.out.println(" left res = " + res);
				l++;
			}

			else{

				if(height[r] >= rightmax)
					rightmax = height[r];
				else 
					res = res + rightmax - height[r];

				r--;

				//System.out.println("right res = " + res);
			}
		}

		return res;
	}
	public static void main(String[] args) {
		
		int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

		int res = storedWater(height);

		System.out.println("result is = " + res);
	}
}