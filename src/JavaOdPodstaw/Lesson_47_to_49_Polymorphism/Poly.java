package JavaOdPodstaw.Lesson_47_to_49_Polymorphism;

import JavaOdPodstaw.Lesson_41_to_43_interface.Document;
import JavaOdPodstaw.Lesson_41_to_43_interface.DrawDocument;
import JavaOdPodstaw.Lesson_41_to_43_interface.TxtDocument;



public class Poly {

    public static void main(String[] args) {
        Document draw = new DrawDocument();

        if(draw instanceof DrawDocument){
            System.out.println(true);
        }
        if(draw instanceof TxtDocument){
            System.out.println(true);
        }

        Box<Document> box1 = new Box<>();
        box1.setT(new TxtDocument());
        box1.setT(new DrawDocument());

        Box<String> box2 = new Box<>();
        box2.setT("box2");

        String n = "1";
        Object o = "abc";
        String s = (String) o;
        int i = Integer.valueOf(n);
        System.out.println(s+n);

        System.out.println(""+ i );


    }
}
