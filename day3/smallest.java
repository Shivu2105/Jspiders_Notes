class smallest		// 
{
	public static int smallest( int a, int b, int c){
			if( a < b && a < c){
				return a;
			} else if( b < c){
				return b;
			}
			else{
				return c;
			}
	}
	public static void main(String[] args) 
	{
		System.out.println(" Method Begins");
		int result = smallest(10,5,-1);
		System.out.println(result);
		System.out.println(" Method Ends"); 
	}
}
