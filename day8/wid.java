class  p1 //type casting widening 
{
	/*public static void widening(byte a){
		short b = a;
		int c = a;
		System.out.println(b);
		System.out.println(c);
	}*/
	public static void main(String[] args) 
	{
		byte a = 123;
		short b = a;
		int c = b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//widening(12B);
	}
}
