package JavaForBeginner.Practice_13_Exceptions;


public class ExceptionsPractice {
    public static void main(String[] args) {


        int x = 5;
        int y = 0;

        try {
            System.out.println(x/y);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }finally {
            System.out.println("finally");

        }
    }
}
