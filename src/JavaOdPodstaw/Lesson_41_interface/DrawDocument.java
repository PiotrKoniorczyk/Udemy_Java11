package JavaOdPodstaw.Lesson_41_interface;

public class DrawDocument implements Interface {
    @Override
    public boolean save() {
        System.out.println("save draw doc");
        return true;
    }

    @Override
    public String open(String path) {
        return "draw file"+path;
    }
}
