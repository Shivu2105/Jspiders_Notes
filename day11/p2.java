package day11;
/*
    Use of static and local varibale print both city from main method
 */
public class p2 {

    static String City = "Mumbai";

    public static void main(String[] args) {
        String City = "Thane";
        System.out.println("Printing local variable "+ City);
        System.out.println("Printing using ClassName "+ p2.City);
        
        // By using clasdsname.var we can print static varibale from global area
    }
}
