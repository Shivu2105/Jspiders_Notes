package day9;

public class p2 {

    static String name;
    static double height;

    public static void Qspiders(){
        System.out.println("Qspiders Begins");
        System.out.println("Name" + name);
        System.out.println("Height "+ height);
        name = "sheela";
        height = 5.9;
        System.out.println("Qspiders ends");
    }

    static{
        System.out.println("Satic Block Initializer");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Begins");
        String name = "Sunny Leone";
        Qspiders();
        System.out.println("Name" + name);
        System.out.println("Name" + p2.name);
        System.out.println("Height "+ height);
        name = "sheela";
        height = 5.9;
        System.out.println("Main Method ends");
    }
}
