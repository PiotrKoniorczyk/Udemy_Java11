package JavaOdPodstaw.Lesson_47_to_49_Polymorphism;


public class Box<T /*extends Document*/>  {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
