package JavaForBeginner.Lesson_19_loopFor;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.println("Nr: " + i);
        }



        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - ");
            for (int j = 10; j < 20; j++) {
                System.out.print(j + ", ");
            }
            System.out.println("");

        }
        for(;;){
            System.out.println("x");
        }

    }
}
