package JavaOdPodstaw.Lesson_41_to_43_interface;

import org.w3c.dom.ls.LSOutput;

public class Document_test {
    public static void main(String[] args) {


        TxtDocument txt = new TxtDocument();
        DrawDocument draw = new DrawDocument();

        System.out.println(txt.open("txtPath"));
        System.out.println(draw.save());

        draw.introduceYourSelf();

        Document calc = new Document() {
            @Override
            public boolean save() {
                return false;
            }

            @Override
            public String open(String path) {
                return null;
            }
        };

        //onClickListener

        draw.draw(() -> {
            System.out.println("onClick");

        });
    }



}