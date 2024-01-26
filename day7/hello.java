class hello 
{
	// we can name the syntax of method in random order
	// here we can interchange ascess modifier and modifier not the method name and datatype
	 static public String greeting(String a){
		return a;
	}
	public static String greeting(String a, String b){
		return a + b;
	}
	public static String greeting(String a, String b, String c){
		return a + b + c;
	}
	public static String greeting(String a, String b, String c, String d){
		return a + b + c + d;
	}
	public static void main(String[] args) 
	{
		String str = greeting("hello");
		String str1 = greeting("hello ", "Sheela");
		String str2 = greeting("hello ", "Sheela", " Kaise ho");
		String str3 = greeting("hello ", "Sheela", " Kaise ho" ,"khana khaya");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}	
}
