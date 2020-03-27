package JavaOdPodstaw.Lesson_41_to_43_interface;

public class DrawDocument implements Document {
    @Override
    public boolean save() {
        System.out.println("save draw doc");
        return true;
    }

    @Override
    public String open(String path) {
        return "draw file"+path;
    }


    public void draw(OnClickListener ocl) {
        System.out.println("draw... ");
    }

    @Override
    public void onClick() {

    }
}
