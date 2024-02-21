package day11;
/*
    Declaring 2 static variable and 2 static block and printing result from both 
    static block and Main method ...
*/  
public class p1 {

    static int a = 67;
    static String b = "Sheela";

    static { // static initializer block (No method name and runed 1st )
        System.out.println("Static Initializer Block 1");
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
    }
    public static void main(String[] args) {
        System.out.println("Main Method Begins");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Main Method Ends");
    }

    static { // static initializer block (No method name and runed 1st after previous sib )
        System.out.println("Static Initializer Block 2");
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
    }
    
}
