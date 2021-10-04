class Str_Index{

	public static void main(String[] args) {
		
		String s1 = new String("Bielearn");

		System.out.println(s1.indexOf('n')); //7
		System.out.println(s1.indexOf('e')); //2
		System.out.println(s1.indexOf('e' , 3)) ; //4
		
		int s2 = s1.indexOf("arn" , 4);
		System.out.println(s2);

//		char ch = s1.indexOf('e');
//		System.out.println(ch);

        System.out.println(s1.lastIndexOf('B'));


       } 
       
}