class calculator 
{
// Calculator code that takes multiple paramterized methods with formal arguments as inputs  
public static void addition(int a, int b, int c, int d){
		int add = a + b+ c+ d;
		System.out.println(add);
	}
	public static void subtract(int a, int b, int c, int d, int e){
		int result = a - b - c- d - e;
		System.out.println(result);
	}

public static void mul(int a, int b, int c, int d, int e, int f){
		int result = a *b *c*d *e*f ;
	   System.out.println(result);
	}

public static void div(int a, int b){
		int result = a / b ;
	   System.out.println(result);
	}


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		addition(10,20,30,40);
		subtract(10,20,30,40,50);
		mul(10,20,30,40,50,60);
		div(10,20);
	}
}
