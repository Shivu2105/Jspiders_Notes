package day9;
class p1{

    static int a = 69;
    static String b = "Chutiya Atharv";
    static{
        
        System.out.println("a"+a);
    }

    static{
        System.out.println("b"+b);
    }
    public static void main(String[] args) {
        System.out.println("Main Method Begins");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Main Methods Ends"); 
    }
}