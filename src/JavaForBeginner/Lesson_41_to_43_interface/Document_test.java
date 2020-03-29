package JavaForBeginner.Lesson_41_to_43_interface;


public class Document_test  {
    public static void main(String[] args) {


        TxtDocument txt = new TxtDocument();
        DrawDocument draw = new DrawDocument();

        System.out.println(txt.open("txtPath"));
        System.out.println(draw.save());

        draw.introduceYourSelf();

        Document calc = new Document() {
            @Override
            public void onClick() {

            }

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