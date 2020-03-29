package JavaForBeginner.Lesson_41_to_43_interface;

public class TxtDocument implements Document {
    @Override
    public boolean save() {
        System.out.println("save txt doc");
        return true;
    }

    @Override
    public String open(String path) {
        return "txt file" + path;
    }

    @Override
    public void onClick() {

    }
}
