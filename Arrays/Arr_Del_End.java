class DFE{
	
	public static void main(String[] args) {
		
		int a[] = new int[10];

		for (int i = 0 ; i < a.length  ; i++ ) {
			
			a[i] = 2*i;
		}
int len = a.length;

		for (int i = 0 ; i < len ; i++  ) {
			
			System.out.println(a[i]);
		}

      for (int i = 0 ; i < len-1 ; i++  ) {
			
			System.out.println(a[i]);
		}


	}
}