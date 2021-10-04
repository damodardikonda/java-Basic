class StrBuff{

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Damodar");
        StringBuilder sb2 =  new StringBuilder("King");
		//length()
		System.out.println(sb1.length()); // 7

		//capacity()
		System.out.println(sb1.capacity()); // 23

		// charAt( int );
		System.out.println(sb1.charAt(4)); // d

		// append()
		sb1.append(22); //Damodar22
		sb1.append("Dikonda"); // Damodar22Dikonda

		sb1.append(sb2); //Damodar22DikondaKing

		System.out.println(sb1);
		System.out.println(sb1.capacity()); // 23

        sb1.insert(9 , "Bhaskar"); // Da,odar22BhaskarDikondaKing
        System.out.println(sb1);

        sb1.deleteCharAt(8); // 2 get deleted
        System.out.println(sb1);

        sb1.delete(7,15);
        System.out.println(sb1);
     
        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();

        	}
}