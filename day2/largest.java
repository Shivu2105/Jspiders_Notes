class largest // use of if else for largest number
{
	public static void largest(int a, int b, int c){
		if( a > b && b> c) {
			System.out.println(a);
		} else if( b > a && a > c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		largest(55, 85, 100);
	}
}
