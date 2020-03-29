package JavaForBeginner.Lesson_56_to_58_Exceptions.Thrown;

import java.io.FileNotFoundException;

public class Thrown {
    public static void main(String[] args) {

        Thrown_2 exc2 = new Thrown_2();
        try {
            exc2.sth();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
