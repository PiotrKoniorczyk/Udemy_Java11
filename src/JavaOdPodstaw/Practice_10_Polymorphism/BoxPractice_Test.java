package JavaOdPodstaw.Practice_10_Polymorphism;

import JavaOdPodstaw.Lesson_41_to_43_interface.Document;
import JavaOdPodstaw.Lesson_41_to_43_interface.OnLongClickListener;
import JavaOdPodstaw.Lesson_47_to_49_Polymorphism.Box;

public class BoxPractice_Test {
    public static void main(String[] args) {



        BoxPractice<String, Integer> boxPractice= new BoxPractice<String, Integer>();

        boxPractice.setT1T2("T1", Integer.valueOf(5));
        System.out.println(boxPractice.getT1());
        System.out.println(boxPractice.getT2());


    }


}
