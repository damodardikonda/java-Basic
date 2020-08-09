class P{


}

class C extends P {

	public static void main(String[] args) {
		
		C c1 =new C();
		C c2 = new C();

		C c= null;

        P p1 = new P();

        boolean ans = c1 instanceof C; // true
        System.out.println(ans);

        boolean ans1 = c instanceof C; //false
        System.out.println(ans1);

        boolean ans2 = p1 instanceof C; //false
        System.out.println(ans2);

        boolean ans3 = c instanceof Object;//false
        System.out.println(ans3);


        boolean ans4 = c1 instanceof P;
        System.out.println(ans4);








	}
}