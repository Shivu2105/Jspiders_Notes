package day12;

public class p1 {

    static boolean a;
    static double b;

    int c = 12;
    static{
        System.out.println("Static block runs");

        System.out.println("Value of global a:" +a);
    }

    {
        System.out.println("Instance Initialization block runs");
        System.out.println("value of non-static variable: " +c);
    }

    public void sheela(){
        
        System.out.println("Sheela begins");
        int c = 1;
        System.out.println("Value of local c: "+ c);
        System.out.println("Value of non static c: "+ this.c);
        System.out.println("Sheela ends");
    }
    public static void main(String[] args) {
        System.out.println("Main method begins");
        p1 data = new p1();
        data.sheela();
        System.out.println("Value of global static var: "+ p1.a );
        // 
        System.out.println("Main method ends");
    }
}
