package JavaForBeginner.Lesson_23_Labels;

public class Labels {
    public static void main(String[] args) {
        LABEL:
        for (int i = 0; i <10 ; i++) {
            System.out.println("i= " + i);
            for (int j = 0; j < 100 ; j++) {
                System.out.println("j= "+ j);
                //break LABEL;
                continue LABEL;
            }


        }
    }
}
