class p1 
{
// In this code we are using return type methods so we use int when we are playing with int data type
	public static int mul(int a , int b, int c , int d)
	{
		int result = a*b* c *d;
		return result; 
		// one method has only 1 return statement
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int res = mul(10,20,30,40);
		System.out.println(res);
		System.out.println("Hello World!");
	}
}
