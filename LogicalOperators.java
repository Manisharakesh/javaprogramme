package HomeWork;

public class LogicalOperators {
    public static void main (String[] args){

        int a = 70;

        System.out.println(a < 75 && a < 50); // return false one operand wrong
        System.out.println(a < 60 || a< 60);//return false
        System.out.println(!(a < 40 && a< 50) ); // true
    }
}
