class Arr_Runtime{

	public static void main(String[] args) {
		
		int[][] i = new int[5][];
		float f []= new float[5];
		char ch[] = new char [5];
		String s[] = new String[4];
		double d[] = new double[2];

		System.out.println(i.getClass());
		System.out.println(f.getClass());
		System.out.println(ch.getClass());
		System.out.println(s.getClass());
		System.out.println(d.getClass());
        
        Arr_Runtime er = new Arr_Runtime();
        System.out.println(er.getClass());
	}
}