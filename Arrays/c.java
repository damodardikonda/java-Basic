class Check{
	
	void func(int num[],int n){

		System.out.println(num);
	}
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,65,5,7,8,9};
       Check c = new Check();
		c.func(a[2],6);
	}
}