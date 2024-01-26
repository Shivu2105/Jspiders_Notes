class  question
{
	public static void printNo(char n){
		if(n <= 3333){
		System.out.println(n);
		printNo(++n);
		}
}
	public static void main(String[] args) 
	{
		printNo(33);
		System.out.println("Hello World!");
	}
}
