class HexToByte{

	public static void main(String[] args) {
		
		String str = "1D08X";
		int it = Integer.parseInt(str);
		BigInteger BigInt = BigInteger.valueOf(it);
		byte arr[] = (BigInteger.toByteArray());

		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i]);
		}
	}
} 