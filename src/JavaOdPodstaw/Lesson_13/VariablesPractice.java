package JavaOdPodstaw.Lesson_13;

public class VariablesPractice {
    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        System.out.println("Suma = " + a + b);
        System.out.println("Suma = " + (a + b));

        System.out.println("-------------------------------------------------");

        int suma = a + b;
        int odejmowanie = a - b;
        int mnozenie = a*b;
        int dzielenie = a/b;

        double a1 = 10.0;
        double b1 = 15.9;
        double dzielenie2 = a1/b1;


        int modulo = a%b;

        System.out.println("suma = " + suma );
        System.out.println("odejmowanie = " + odejmowanie );
        System.out.println("mnozenie = " + mnozenie );
        System.out.println("dzielenie błąd = " + dzielenie);
        System.out.println("dzielenie poprawne = " + dzielenie2);
        System.out.println("modulo = " + modulo );


    }
}
