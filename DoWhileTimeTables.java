package Class13Homework;

public class DoWhileTimeTables {
    public static void main(String[] args) {
        // print multiplication table of 13
        int i = 13;
        int j = 1;
        do {
            System.out.println("13 * " + j + " = " + i * j);
            j++;
        }
        while(j<=10);



    }
}