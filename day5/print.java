// Quiz question here we are suppose to print char alternatively and a 25 number after passing single number
class Printing 
{
	public static void print(char n){
		if(n>='a' && n<= 'z' || n>='A' && n<= 'Z'){
			System.out.println(n); 
			print((char)(n+2));
			} 
	}

	public static void print(int start, int last){
		System.out.println(start);
	 if(last>=1){
				print(start+1, last-1);
			}
	} 
	public static void main(String[] args) 
	{
		System.out.println("Main Method Begins");
		print('a');
		print(25,25);
		print('C');
		System.out.println("Main Method Ends");
	}
}
