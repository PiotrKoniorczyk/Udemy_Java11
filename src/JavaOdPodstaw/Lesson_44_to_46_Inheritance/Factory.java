package JavaOdPodstaw.Lesson_44_to_46_Inheritance;

public abstract class Factory {
    public final void produce(){
        System.out.println("produce");
    }

    public void checkState(){
        System.out.println("checkState");

    }


    public abstract void destroid();

    public String introduceYourself(){
        return "Factory";
    }



}
