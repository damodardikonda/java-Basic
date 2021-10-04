class HoursAngle{

	public static int findAngle(int hr , int min){

		int h = (hr * 360) / 12 + (min * 360) / (12 * 60);

		int m  = (min*360) / 60;

		int angle = Math.abs(h - m);

		if(angle > 180)

				angle = 360 - angle;

		return angle;
	}
	public static void main(String[] args) {
		
		int hr = 9;
		int min = 00;

		System.out.println(findAngle(hr,min));
	}
}