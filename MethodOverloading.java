package Class14OopsHomework;

public class MethodOverloading {
    //There are two methods that add numbers of different type:
    //Method overloading,multiple methods can have same name with different parameters.
    static int addMethod(int a, int b ){
        return a + b;
    }
    static double addMethod(double x, double y){
        return x + y;
    }

        public static void main(String[] args){
        int c = addMethod(100, 200);
        double d = addMethod(7.5, 9.9);
        System.out.println("int: " +  c);
        System.out.println("double: "+ d);

    }
}
