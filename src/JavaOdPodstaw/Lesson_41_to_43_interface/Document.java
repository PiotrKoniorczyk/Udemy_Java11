package JavaOdPodstaw.Lesson_41_to_43_interface;

public interface Document extends OnClickListener {

    public String d = "d";

    public boolean save();


    public String open(String path);

    public default void introduceYourSelf(){
        System.out.println("Interface Document");
    }



}
