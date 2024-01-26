class print 
{
	public static double area(double a){
		return  a*a;
	}
	public static double area (double l, double b){
		return l*b;
	}
	public static void main(String[] args) 
	{
		double square = area(4D);
		double rectangle = area(4D,5D); 
		System.out.println(square);
		System.out.println(rectangle);
	}
}
