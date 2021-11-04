package Class14OopsHomework;

public class RunTest {
    public static void main(String[] args) {

        Cow c = new Cow();
        c.colour = "white and black";
        c.diet = "Vegetarian";
        System.out.println(c.colour + " " + c.diet);

        c.getNumberOfLegs();


        Donkey d = new Donkey();
        d.colour = "Grey, white ,black";
        d.diet = "vegetarian";
        System.out.println(d.colour + " " + d.diet);

        d.getNumberOfLegs();


    }

    }

