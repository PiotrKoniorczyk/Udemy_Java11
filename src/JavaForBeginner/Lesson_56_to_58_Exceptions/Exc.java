package JavaForBeginner.Lesson_56_Exceptions;

public class Exc {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;

      try{
          System.out.println(x/y);

      } catch (ArithmeticException e){
          System.out.println("ArithmeticException - divide by zero error"+ e.getMessage());
      } catch (Exception e1){
          System.out.println("All Exception - unknown error");
      }

    }
}
