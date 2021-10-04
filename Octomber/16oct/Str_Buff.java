class Str_Buff{

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();

		StringBuffer sb2 = new StringBuffer("Pune");

		StringBuffer sb3 = new StringBuffer("Satara");

		StringBuffer sb4 = new StringBuffer("Mumbai");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);

		sb1.append("Kasba Peth");
		sb2.append("MH-12");
		sb3.append("MH-11");
		sb4.append("MH-42");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
        
	}
}