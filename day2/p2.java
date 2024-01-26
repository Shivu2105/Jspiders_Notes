class add //using just 1 method to return result for many other paramters  
{

	public static int add(int a, int b){
			int result = a + b;
			return result;
	}

	public static int add(int a, int b, int c){
			int result = a + b + c;
			return result;
	}

	public static int add(int a, int b, int c, int d){
			int result = a + b + c + d;
			return result;
	}

	public static int add(int a, int b, int c, int d, int e){
			int result = a + b + c +d +e;
			return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Begins");
		int res1 = add(10,20);
		int res2 = add(10,20,30);
		int res3 = add(10,20,30,40);
		int res4 = add(10,20,30,40,50);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		System.out.println("Main Method Ends");
	}
}
