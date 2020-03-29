package JavaForBeginner.Lesson_13;

public class VariablesPractice {
    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        System.out.println("Sum = " + a + b);
        System.out.println("Sum = " + (a + b));

        System.out.println("-------------------------------------------------");

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a*b;
        int division = a/b;

        double a1 = 10.0;
        double b1 = 15.9;
        double division2 = a1/b1;


        int modulo = a%b;

        System.out.println("sum = " + sum );
        System.out.println("subtraction = " + subtraction );
        System.out.println("multiplication = " + multiplication );
        System.out.println("division faild = " + division);
        System.out.println("division poprawne = " + division2);
        System.out.println("modulo = " + modulo );


    }
}
